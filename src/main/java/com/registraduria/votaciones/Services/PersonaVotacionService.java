package com.registraduria.votaciones.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registraduria.votaciones.Models.PersonaVotacion;
import com.registraduria.votaciones.Repositories.PersonaVotacionRepository;

@Service
public class PersonaVotacionService {
    
    @Autowired
    private PersonaVotacionRepository personaVotacionRepository;


    public List<PersonaVotacion> get()
    {
        return (List<PersonaVotacion>) personaVotacionRepository.findAll();
    }
}
