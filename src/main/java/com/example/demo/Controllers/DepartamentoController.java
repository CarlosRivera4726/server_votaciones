package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Departamento;
import com.example.demo.Services.DepartamentoService;

@RestController
@RequestMapping(path = "/departamento")
@CrossOrigin
public class DepartamentoController {
    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping(path = "")
    public List<Departamento> GetAllUbicaciones(){
        return departamentoService.GetAll();
    }

    @GetMapping(path = "/{id}")
    public Departamento GetUbicacionById(@PathVariable("id") Integer id){
        return departamentoService.GetById(id).get();
    }
    
}
