package com.empleos.backend.service;

import com.empleos.backend.model.ofertaEmpleo;
import java.util.List;

public interface ofertaEmpleoService {

    List<ofertaEmpleo> findAll();

    ofertaEmpleo findById(String id);

    ofertaEmpleo save(ofertaEmpleo oferta);

    ofertaEmpleo update(String id, ofertaEmpleo oferta);

    void delete(String id);
}
