package com.empleos.backend.controller;

import com.empleos.backend.model.postulacion;
import com.empleos.backend.service.postulacionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/postulaciones")
@CrossOrigin(origins = "*")
public class postulacionController {

    private final postulacionService postulacionService;

    public postulacionController(postulacionService postulacionService) {
        this.postulacionService = postulacionService;
    }

    @GetMapping
    public ResponseEntity<List<postulacion>> findAll() {
        return ResponseEntity.ok(postulacionService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<postulacion> findById(@PathVariable String id) {
        postulacion p = postulacionService.findById(id);
        if (p == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(p);
    }

    @PostMapping
    public ResponseEntity<postulacion> save(@RequestBody postulacion postulacion) {
        return ResponseEntity.ok(postulacionService.save(postulacion));
    }

    @PutMapping("/{id}")
    public ResponseEntity<postulacion> update(@PathVariable String id, @RequestBody postulacion body) {
        postulacion existente = postulacionService.findById(id);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }

        // Setear el ID correctamente
        body.setId(id);

        return ResponseEntity.ok(postulacionService.save(body));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        postulacion existente = postulacionService.findById(id);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }

        postulacionService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
