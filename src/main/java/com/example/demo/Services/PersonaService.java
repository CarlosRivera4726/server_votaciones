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


    public List<Persona> GetAll(){
        return (List<Persona>)personaRepository.findAll();
    }

    public Optional<Persona> GetById(UUID id){
        return personaRepository.findById(id);
    }

    public void Add(Persona persona){
        personaRepository.save(persona);
    }

    public void Update(Persona persona){
        personaRepository.save(persona);
    }

    public void Delete(UUID id){
        personaRepository.deleteById(id);
    }

}
