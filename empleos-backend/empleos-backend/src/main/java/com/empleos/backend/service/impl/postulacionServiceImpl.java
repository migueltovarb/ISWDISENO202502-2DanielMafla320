package com.empleos.backend.service.impl;

import com.empleos.backend.model.postulacion;
import com.empleos.backend.repository.postulacionRepository;
import com.empleos.backend.service.postulacionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class postulacionServiceImpl implements postulacionService {

    private final postulacionRepository repo;

    public postulacionServiceImpl(postulacionRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<postulacion> findAll() {
        return repo.findAll();
    }

    @Override
    public postulacion findById(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public postulacion save(postulacion p) {
        return repo.save(p);
    }

    @Override
    public postulacion update(String id, postulacion p) {
        postulacion existente = repo.findById(id).orElse(null);
        if (existente == null) return null;

        existente.setCandidatoId(p.getCandidatoId());
        existente.setEmpresaId(p.getEmpresaId());
        existente.setOfertaId(p.getOfertaId());
        existente.setEstado(p.getEstado());

        return repo.save(existente);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
