package com.empleos.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "postulaciones")
public class postulacion {

    @Id
    private String id;

    private String candidatoId;   // referencia al candidato
    private String ofertaId;      // referencia a la oferta
    private String empresaId;     // referencia a la empresa

    private Date fecha;           // <-- FALTABA SEGÚN EL DIAGRAMA
    private TipoEstado estado;    // pendiente / aceptado / rechazado

    public postulacion() {}

    public postulacion(String id, String candidatoId, String ofertaId,
                       String empresaId, Date fecha, TipoEstado estado) {
        this.id = id;
        this.candidatoId = candidatoId;
        this.ofertaId = ofertaId;
        this.empresaId = empresaId;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCandidatoId() {
        return candidatoId;
    }

    public void setCandidatoId(String candidatoId) {
        this.candidatoId = candidatoId;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TipoEstado getEstado() {
        return estado;
    }

    public void setEstado(TipoEstado estado) {
        this.estado = estado;
    }
}
