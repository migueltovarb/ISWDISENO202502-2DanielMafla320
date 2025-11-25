package com.empleos.backend.service;

import com.empleos.backend.model.usuario;
import java.util.List;

public interface usuarioService {

    List<usuario> findAll();

    usuario findById(String id);

    usuario save(usuario usuario);

    usuario update(String id, usuario usuario);

    void delete(String id);
}
