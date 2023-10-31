package com.registraduria.votaciones.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registraduria.votaciones.Models.PersonaVotacion;
import com.registraduria.votaciones.Services.PersonaVotacionService;

@RestController
@RequestMapping(path = "/persona_votacion")
public class PersonaVotacionController {
    @Autowired
    private PersonaVotacionService personaVotacionService;

    @GetMapping("")
    public List<PersonaVotacion> get()
    {
        return personaVotacionService.get();
    }
    
}
