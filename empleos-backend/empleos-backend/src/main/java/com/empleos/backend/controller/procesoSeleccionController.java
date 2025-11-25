package com.empleos.backend.controller;

import com.empleos.backend.model.procesoSeleccion;
import com.empleos.backend.service.procesoSeleccionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/procesos-seleccion")
@CrossOrigin(origins = "*")
public class procesoSeleccionController {

    private final procesoSeleccionService procesoSeleccionService;

    public procesoSeleccionController(procesoSeleccionService procesoSeleccionService) {
        this.procesoSeleccionService = procesoSeleccionService;
    }

    @GetMapping
    public ResponseEntity<List<procesoSeleccion>> findAll() {
        return ResponseEntity.ok(procesoSeleccionService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<procesoSeleccion> findById(@PathVariable String id) {
        procesoSeleccion proceso = procesoSeleccionService.findById(id);
        if (proceso == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(proceso);
    }

    @PostMapping
    public ResponseEntity<procesoSeleccion> save(@RequestBody procesoSeleccion proceso) {
        return ResponseEntity.ok(procesoSeleccionService.save(proceso));
    }

    @PutMapping("/{id}")
    public ResponseEntity<procesoSeleccion> update(@PathVariable String id, @RequestBody procesoSeleccion body) {
        procesoSeleccion existente = procesoSeleccionService.findById(id);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }

        body.setId(id);

        return ResponseEntity.ok(procesoSeleccionService.save(body));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        procesoSeleccion existente = procesoSeleccionService.findById(id);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }

        procesoSeleccionService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
