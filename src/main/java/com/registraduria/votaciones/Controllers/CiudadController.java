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

import com.registraduria.votaciones.Models.Ciudad;
import com.registraduria.votaciones.Services.CiudadService;

@RestController
@RequestMapping(path = "/ciudad")
@CrossOrigin
public class CiudadController {
    @Autowired
    private CiudadService ciudadService;

    @GetMapping(path = "")
    public List<Ciudad> GetAllCiudades() {
        return ciudadService.GetAll();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Ciudad> GetUbicacionById(@PathVariable("id") Integer id) {
        Optional<Ciudad> ciudad = ciudadService.GetById(id);
        return ciudad.map(c -> ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(path = "/departamento/{id}")
    public ResponseEntity<Ciudad> getAllCiudadesByDepartamento(@PathVariable("id") Integer id) {
        Optional<Ciudad> ciudad = ciudadService.GetByDepartamento(id);

        return ciudad.map(c -> ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound().build());
    }

}
