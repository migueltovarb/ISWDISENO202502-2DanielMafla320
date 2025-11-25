package com.empleos.backend.service.impl;

import com.empleos.backend.model.empresa;
import com.empleos.backend.repository.empresaRepository;
import com.empleos.backend.service.empresaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class empresaServiceImpl implements empresaService {

    private final empresaRepository repo;

    public empresaServiceImpl(empresaRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<empresa> findAll() {
        return repo.findAll();
    }

    @Override
    public empresa findById(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public empresa save(empresa empresa) {
        return repo.save(empresa);
    }

    @Override
    public empresa update(String id, empresa empresa) {
        empresa existente = repo.findById(id).orElse(null);
        if (existente == null) return null;

        existente.setNombre(empresa.getNombre());
        existente.setCorreo(empresa.getCorreo());
        existente.setTelefono(empresa.getTelefono());
        existente.setSector(empresa.getSector());

        return repo.save(existente);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
