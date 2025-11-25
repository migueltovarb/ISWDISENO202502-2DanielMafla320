package com.empleos.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "procesosSeleccion")
public class procesoSeleccion {

    @Id
    private String id;

    private String postulacionId;
    private String ofertaId;
    private String empresaId;
    private String candidatoId;

    private TipoEstado estado;

    private Date fechaInicio;    // <-- FALTABA SEGÚN EL DIAGRAMA

    public procesoSeleccion() {}

    public procesoSeleccion(String id, String postulacionId, String ofertaId,
                            String empresaId, String candidatoId,
                            TipoEstado estado, Date fechaInicio) {
        this.id = id;
        this.postulacionId = postulacionId;
        this.ofertaId = ofertaId;
        this.empresaId = empresaId;
        this.candidatoId = candidatoId;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostulacionId() {
        return postulacionId;
    }

    public void setPostulacionId(String postulacionId) {
        this.postulacionId = postulacionId;
    }

    public String getOfertaId() {
        return ofertaId;
    }

    public void setOfertaId(String ofertaId) {
        this.ofertaId = ofertaId;
    }

    public String getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(String empresaId) {
        this.empresaId = empresaId;
    }

    public String getCandidatoId() {
        return candidatoId;
    }

    public void setCandidatoId(String candidatoId) {
        this.candidatoId = candidatoId;
    }

    public TipoEstado getEstado() {
        return estado;
    }

    public void setEstado(TipoEstado estado) {
        this.estado = estado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
