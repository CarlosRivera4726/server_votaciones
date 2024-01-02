package com.registraduria.votaciones.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registraduria.votaciones.Models.Departamento;
import com.registraduria.votaciones.Services.DepartamentoService;

@RestController
@RequestMapping(path = "/departamento")
@CrossOrigin
public class DepartamentoController {
    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping(path = "")
    public List<Departamento> GetAllUbicaciones() {
        return departamentoService.GetAll();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Departamento> GetUbicacionById(@PathVariable("id") Integer id) {
        Optional<Departamento> departamento = departamentoService.GetById(id);
        return departamento.map(d -> ResponseEntity.ok().body(d))
                .orElse(ResponseEntity.notFound().build());
    }

}
