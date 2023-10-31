package com.registraduria.votaciones.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.registraduria.votaciones.Models.Votacion;

public interface VotacionRepository extends CrudRepository<Votacion, Integer> {
    
}
