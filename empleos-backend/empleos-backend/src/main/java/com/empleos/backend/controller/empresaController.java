package com.empleos.backend.controller;

import com.empleos.backend.model.empresa;
import com.empleos.backend.service.empresaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresa")
@CrossOrigin(origins = "*")
public class empresaController {

    private final empresaService service;

    public empresaController(empresaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<empresa>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<empresa> getById(@PathVariable String id) {
        empresa emp = service.findById(id);
        return emp != null ? ResponseEntity.ok(emp) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<empresa> create(@RequestBody empresa empresa) {
        return ResponseEntity.ok(service.save(empresa));
    }

    @PutMapping("/{id}")
    public ResponseEntity<empresa> update(@PathVariable String id, @RequestBody empresa empresa) {
        empresa updated = service.update(id, empresa);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
