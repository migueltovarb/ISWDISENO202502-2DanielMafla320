package com.empleos.backend.repository;

import com.empleos.backend.model.empresa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface empresaRepository extends MongoRepository<empresa, String> {
}
