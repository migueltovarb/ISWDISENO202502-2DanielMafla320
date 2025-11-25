package com.empleos.backend.controller;

import com.empleos.backend.model.usuario;
import com.empleos.backend.service.usuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*")
public class usuarioController {

    private final usuarioService usuarioService;

    public usuarioController(usuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<usuario>> getAll() {
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<usuario> getById(@PathVariable String id) {
        usuario u = usuarioService.findById(id);
        if (u == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(u);
    }

    @PostMapping
    public ResponseEntity<usuario> create(@RequestBody usuario usuario) {
        return ResponseEntity.ok(usuarioService.save(usuario));
    }

    @PutMapping("/{id}")
    public ResponseEntity<usuario> update(@PathVariable String id, @RequestBody usuario usuario) {
        usuario existing = usuarioService.findById(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }

        usuario.setId(id); // aseguramos actualización
        return ResponseEntity.ok(usuarioService.save(usuario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        usuario existing = usuarioService.findById(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }

        usuarioService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
