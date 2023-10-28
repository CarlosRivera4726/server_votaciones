package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Ciudad;
import com.example.demo.Services.CiudadService;


@RestController
@RequestMapping(path = "/ciudad")
@CrossOrigin
public class CiudadController {
    @Autowired
    private CiudadService ciudadService;

    @GetMapping(path = "")
    public List<Ciudad> GetAllCiudades(){
        return ciudadService.GetAll();
    }

    @GetMapping(path = "/{id}")
    public Ciudad GetUbicacionById(@PathVariable("id") Integer id){
        return ciudadService.GetById(id).get();
    }

    @GetMapping(path = "/departamento/{id}")
    public List<Ciudad> getAllCiudadesByDepartamento(@PathVariable("id") Integer id){
        return ciudadService.GetByDepartamento(id);
    }
    
}
