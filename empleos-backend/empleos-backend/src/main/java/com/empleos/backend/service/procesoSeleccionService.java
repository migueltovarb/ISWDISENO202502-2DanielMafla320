package com.empleos.backend.service;

import com.empleos.backend.model.procesoSeleccion;
import java.util.List;

public interface procesoSeleccionService {

    List<procesoSeleccion> findAll();

    procesoSeleccion findById(String id);

    procesoSeleccion save(procesoSeleccion proceso);

    procesoSeleccion update(String id, procesoSeleccion proceso);

    void delete(String id);
}
