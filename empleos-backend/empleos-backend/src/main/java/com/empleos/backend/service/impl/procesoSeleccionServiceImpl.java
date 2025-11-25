package com.empleos.backend.service.impl;

import com.empleos.backend.model.procesoSeleccion;
import com.empleos.backend.repository.procesoSeleccionRepository;
import com.empleos.backend.service.procesoSeleccionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class procesoSeleccionServiceImpl implements procesoSeleccionService {

    private final procesoSeleccionRepository repo;

    public procesoSeleccionServiceImpl(procesoSeleccionRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<procesoSeleccion> findAll() {
        return repo.findAll();
    }

    @Override
    public procesoSeleccion findById(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public procesoSeleccion save(procesoSeleccion ps) {
        return repo.save(ps);
    }

    @Override
    public procesoSeleccion update(String id, procesoSeleccion ps) {
        procesoSeleccion existente = repo.findById(id).orElse(null);
        if (existente == null) return null;

        existente.setPostulacionId(ps.getPostulacionId());
        existente.setEmpresaId(ps.getEmpresaId());
        existente.setOfertaId(ps.getOfertaId());
        existente.setCandidatoId(ps.getCandidatoId());
        existente.setEstado(ps.getEstado());

        return repo.save(existente);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
