package com.empleos.backend.service.impl;

import com.empleos.backend.model.usuario;
import com.empleos.backend.repository.usuarioRepository;
import com.empleos.backend.service.usuarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usuarioServiceImpl implements usuarioService {

    private final usuarioRepository usuarioRepository;

    public usuarioServiceImpl(usuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public usuario findById(String id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public usuario save(usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public usuario update(String id, usuario usuario) {
        usuario existente = usuarioRepository.findById(id).orElse(null);
        if (existente == null) return null;

        existente.setNombre(usuario.getNombre());
        existente.setCorreo(usuario.getCorreo());
        existente.setContrasena(usuario.getContrasena());
        return usuarioRepository.save(existente);
    }

    @Override
    public void delete(String id) {
        usuarioRepository.deleteById(id);
    }
}
