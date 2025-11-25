package com.empleos.backend.service;

import com.empleos.backend.model.candidato;
import java.util.List;

public interface candidatoService {

    List<candidato> findAll();

    candidato findById(String id);

    candidato save(candidato candidato);

    candidato update(String id, candidato candidato);

    void delete(String id);
}
