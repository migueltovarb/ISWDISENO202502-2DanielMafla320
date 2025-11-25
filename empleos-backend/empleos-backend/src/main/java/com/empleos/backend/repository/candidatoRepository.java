package com.empleos.backend.repository;

import com.empleos.backend.model.candidato;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface candidatoRepository extends MongoRepository<candidato, String> {
}
