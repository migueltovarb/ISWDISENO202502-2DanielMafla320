package com.empleos.backend.service;

import com.empleos.backend.model.postulacion;
import java.util.List;

public interface postulacionService {

    List<postulacion> findAll();

    postulacion findById(String id);

    postulacion save(postulacion postulacion);

    postulacion update(String id, postulacion postulacion);

    void delete(String id);
}
