package com.example.demo.Controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Persona;
import com.example.demo.Services.PersonaService;

@RestController
@RequestMapping(path = "/personas")
public class PersonaController {
    @Autowired
    private PersonaService personasServices;


    @GetMapping(path = "")
    public List<Persona> getAllPersonas(){
        return personasServices.GetAllPersonas();
    }

    @GetMapping(path = "/{id}")
    public Persona getPersona(@PathVariable String id){
        UUID uuid = UUID.fromString(id);
        //String idBinario = "UUID_TO_BIN('" + uuid.toString() + "')";
        
        return personasServices.GetById(uuid).get();
    }
}
