package com.empleos.backend.service;

import com.empleos.backend.model.empresa;
import java.util.List;

public interface empresaService {

    List<empresa> findAll();

    empresa findById(String id);

    empresa save(empresa empresa);

    empresa update(String id, empresa empresa);

    void delete(String id);
}
