package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.PersonaRepository;
import com.example.demo.Models.Persona;
@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personasRepository;


    public List<Persona> GetAllPersonas(){
        return (List<Persona>)personasRepository.findAll();
    }

    public Optional<Persona> GetById(byte[] id){
        return personasRepository.findById(id);
    }

}
