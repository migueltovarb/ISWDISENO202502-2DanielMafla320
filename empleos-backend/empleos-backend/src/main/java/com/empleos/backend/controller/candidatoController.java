package com.empleos.backend.controller;

import com.empleos.backend.model.candidato;
import com.empleos.backend.service.candidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidatos")
@CrossOrigin(origins = "*")
public class candidatoController {

    @Autowired
    private candidatoService candidatoService;

    @GetMapping
    public ResponseEntity<List<candidato>> findAll() {
        return ResponseEntity.ok(candidatoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<candidato> findById(@PathVariable String id) {
        candidato c = candidatoService.findById(id);
        return c != null ? ResponseEntity.ok(c) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<candidato> save(@RequestBody candidato candidato) {
        return ResponseEntity.ok(candidatoService.save(candidato));
    }

    @PutMapping("/{id}")
    public ResponseEntity<candidato> update(
            @PathVariable String id,
            @RequestBody candidato candidato
    ) {
        candidato updated = candidatoService.update(id, candidato);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        candidatoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
