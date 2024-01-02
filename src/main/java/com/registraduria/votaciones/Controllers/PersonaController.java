package com.registraduria.votaciones.Controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registraduria.votaciones.Models.Persona;
import com.registraduria.votaciones.Services.PersonaService;

@RestController
@RequestMapping(path = "/personas")
@CrossOrigin
public class PersonaController {
    // private method
    private UUID StringToUUID(String id) {
        return UUID.fromString(id);
    }

    @Autowired
    private PersonaService personasServices;

    @GetMapping(path = "")
    public List<Persona> getAllPersonas() {
        return personasServices.GetAll();
    }

    @GetMapping(path = "/{id}")
    public Persona getPersona(@PathVariable String id) {
        UUID uuid = StringToUUID(id);
        return personasServices.GetById(uuid).get();
    }

    @PostMapping(path = "")
    public void AddPersona(@RequestBody Persona persona) {
        personasServices.Add(persona);
    }

    @DeleteMapping(path = "/{id}")
    public void DeletePersonaById(@PathVariable String id) {
        UUID uuid = StringToUUID(id);
        personasServices.Delete(uuid);
    }

    @PutMapping(path = "/{id}")
    public void UpdatePersonaById(@PathVariable("id") String id, @RequestBody Persona persona) {
        personasServices.Update(persona);
    }

}
