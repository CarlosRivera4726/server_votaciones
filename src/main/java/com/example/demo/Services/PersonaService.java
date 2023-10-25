package com.example.demo.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.PersonaRepository;
import com.example.demo.Models.Persona;
@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;


    public List<Persona> GetAllPersonas(){
        return (List<Persona>)personaRepository.findAll();
    }

    public Optional<Persona> GetById(UUID id){
        return personaRepository.findById(id);
    }

    public void AddPersona(Persona persona){
        personaRepository.save(persona);
    }

    public void UpdatePersona(Persona persona){
        personaRepository.save(persona);
    }

    public void DeletePersona(UUID id){
        personaRepository.deleteById(id);
    }

}
