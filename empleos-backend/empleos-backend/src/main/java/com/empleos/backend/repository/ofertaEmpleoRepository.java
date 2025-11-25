package com.empleos.backend.repository;

import com.empleos.backend.model.ofertaEmpleo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ofertaEmpleoRepository extends MongoRepository<ofertaEmpleo, String> {
}

