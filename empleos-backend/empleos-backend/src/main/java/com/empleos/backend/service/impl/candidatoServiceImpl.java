package com.empleos.backend.service.impl;

import com.empleos.backend.model.candidato;
import com.empleos.backend.repository.candidatoRepository;
import com.empleos.backend.service.candidatoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class candidatoServiceImpl implements candidatoService {

    private final candidatoRepository candidatoRepository;

    public candidatoServiceImpl(candidatoRepository candidatoRepository) {
        this.candidatoRepository = candidatoRepository;
    }

    @Override
    public List<candidato> findAll() {
        return candidatoRepository.findAll();
    }

    @Override
    public candidato findById(String id) {
        return candidatoRepository.findById(id).orElse(null);
    }

    @Override
    public candidato save(candidato candidato) {
        return candidatoRepository.save(candidato);
    }

    @Override
    public candidato update(String id, candidato candidato) {
        candidato existente = candidatoRepository.findById(id).orElse(null);
        if (existente == null) return null;

        // Actualizar campos según el modelo
        existente.setNombre(candidato.getNombre());
        existente.setCorreo(candidato.getCorreo());
        existente.setTelefono(candidato.getTelefono());
        existente.setProfesion(candidato.getProfesion());

        return candidatoRepository.save(existente);
    }

    @Override
    public void delete(String id) {
        candidatoRepository.deleteById(id);
    }
}
