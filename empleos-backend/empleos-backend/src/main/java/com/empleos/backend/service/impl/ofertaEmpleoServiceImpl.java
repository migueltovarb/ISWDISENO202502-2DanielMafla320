package com.empleos.backend.service.impl;

import com.empleos.backend.model.ofertaEmpleo;
import com.empleos.backend.repository.ofertaEmpleoRepository;
import com.empleos.backend.service.ofertaEmpleoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ofertaEmpleoServiceImpl implements ofertaEmpleoService {

    private final ofertaEmpleoRepository repo;

    public ofertaEmpleoServiceImpl(ofertaEmpleoRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<ofertaEmpleo> findAll() {
        return repo.findAll();
    }

    @Override
    public ofertaEmpleo findById(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public ofertaEmpleo save(ofertaEmpleo oferta) {
        return repo.save(oferta);
    }

    @Override
    public ofertaEmpleo update(String id, ofertaEmpleo oferta) {
        ofertaEmpleo existente = repo.findById(id).orElse(null);
        if (existente == null) return null;

        // aquí actualizas los campos según tu modelo real
        existente.setTitulo(oferta.getTitulo());
        existente.setDescripcion(oferta.getDescripcion());
        existente.setSalario(oferta.getSalario());
        existente.setUbicacion(oferta.getUbicacion());
        existente.setRequisitos(oferta.getRequisitos());

        return repo.save(existente);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
