package com.registraduria.votaciones.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registraduria.votaciones.Models.Persona;
import com.registraduria.votaciones.Repositories.PersonaRepository;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> GetAll() {
        return (List<Persona>) personaRepository.findAll();
    }

    public Optional<Persona> GetById(UUID id) {
        return personaRepository.findById(id);
    }

    public void Add(Persona persona) {
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getCedula());
        System.out.println(persona.getContraseña());
        System.out.println(persona.getCiudad().getNombre());
        System.out.println(persona.getCiudad().getDepartamento().getNombre());

        String encodedPassword = new PasswordEncoderService().encodePassword(persona.getContraseña());
        persona.setContraseña(encodedPassword);
        personaRepository.save(persona);
    }

    public void Update(Persona persona) {
        personaRepository.save(persona);
    }

    public void Delete(UUID id) {
        personaRepository.deleteById(id);
    }

}
