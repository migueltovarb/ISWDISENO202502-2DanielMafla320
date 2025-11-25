package com.empleos.backend.repository;

import com.empleos.backend.model.procesoSeleccion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface procesoSeleccionRepository extends MongoRepository<procesoSeleccion, String> {
}
