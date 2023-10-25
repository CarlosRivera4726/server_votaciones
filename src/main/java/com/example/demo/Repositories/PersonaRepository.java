package com.example.demo.Repositories;

//import java.util.Optional;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;

import com.example.demo.Models.Persona;

public interface PersonaRepository extends CrudRepository<Persona, byte[]> {
    /*@Query(value = "SELECT * FROM personas WHERE id = UUID_TO_BIN(:id)", nativeQuery = true)
    Optional<Persona> findById(@Param("id") String id);*/
}

