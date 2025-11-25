package com.empleos.backend.repository;

import com.empleos.backend.model.usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface usuarioRepository extends MongoRepository<usuario, String> {
    usuario findByCorreo(String correo);
}
