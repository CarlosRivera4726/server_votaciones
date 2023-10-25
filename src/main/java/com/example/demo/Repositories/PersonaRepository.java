package com.example.demo.Repositories;

import java.util.UUID;

//import java.util.Optional;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;

import com.example.demo.Models.Persona;

public interface PersonaRepository extends CrudRepository<Persona, UUID> {
}

