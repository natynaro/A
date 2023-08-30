package com.sebas_seguimiento.seguimiento1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sebas_seguimiento.seguimiento1.model.Mono;
import com.sebas_seguimiento.seguimiento1.services.IMonoService;

@RestController
@RequestMapping("/Mono")
public class MonosController {
    
    @Autowired
    private IMonoService monoService;

    @GetMapping("/listar")
    public List<Mono> listar() {
        return monoService.findAll();
    }

    @GetMapping("/listar/{id}")
    public Mono listarPorId(@PathVariable Long id) {
        return monoService.findById(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        monoService.deleteById(id);
    }

    @PostMapping("/actualizar/{id}")
    public Mono guardar(@PathVariable Long id, @RequestBody Mono mono) {
        Mono monoActual = monoService.findById(id);
        if(monoActual != null) {
            monoActual.setNombre(mono.getNombre());
            monoActual.setFamilia(mono.getFamilia());
            monoActual.setDescripcion(mono.getDescripcion());
            monoActual.setHabilidades(mono.getHabilidades());
            monoService.save(monoActual);
        }
        return monoService.save(monoActual);
    }

    @PutMapping("/guardar")
    public void actualizar(@RequestBody Mono mono) {
        monoService.save(mono);
    }
    
}
