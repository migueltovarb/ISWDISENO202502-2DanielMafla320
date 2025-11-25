package com.empleos.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ofertasEmpleo")
public class ofertaEmpleo {

    @Id
    private String id;
    private String titulo;
    private String descripcion;
    private String requisitos;
    private double salario;
    private String ubicacion;   // <-- AGREGADO
    private String empresaId;

    public ofertaEmpleo() {}

    public ofertaEmpleo(String id, String titulo, String descripcion, String requisitos,
                        double salario, String ubicacion, String empresaId) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.requisitos = requisitos;
        this.salario = salario;
        this.ubicacion = ubicacion;
        this.empresaId = empresaId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) { this.id = id; }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getRequisitos() {
        return requisitos;
    }
    public void setRequisitos(String requisitos) { this.requisitos = requisitos; }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) { this.salario = salario; }

    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public String getEmpresaId() {
        return empresaId;
    }
    public void setEmpresaId(String empresaId) { this.empresaId = empresaId; }
}
