package com.empleos.backend.repository;

import com.empleos.backend.model.postulacion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface postulacionRepository extends MongoRepository<postulacion, String> {

    List<postulacion> findByCandidatoId(String candidatoId);

    List<postulacion> findByOfertaId(String ofertaId);

    List<postulacion> findByEmpresaId(String empresaId);
}
