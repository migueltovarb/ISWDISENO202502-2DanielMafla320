package com.empleos.backend.controller;

import com.empleos.backend.model.ofertaEmpleo;
import com.empleos.backend.service.ofertaEmpleoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ofertas")
@CrossOrigin(origins = "*")
public class ofertaEmpleoController {

    @Autowired
    private ofertaEmpleoService ofertaEmpleoService;

    @GetMapping
    public ResponseEntity<List<ofertaEmpleo>> findAll() {
        return ResponseEntity.ok(ofertaEmpleoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ofertaEmpleo> findById(@PathVariable String id) {
        ofertaEmpleo oferta = ofertaEmpleoService.findById(id);
        return oferta != null ? ResponseEntity.ok(oferta) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<ofertaEmpleo> save(@RequestBody ofertaEmpleo oferta) {
        return ResponseEntity.ok(ofertaEmpleoService.save(oferta));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ofertaEmpleo> update(
            @PathVariable String id,
            @RequestBody ofertaEmpleo oferta
    ) {
        ofertaEmpleo updated = ofertaEmpleoService.update(id, oferta);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        ofertaEmpleoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
