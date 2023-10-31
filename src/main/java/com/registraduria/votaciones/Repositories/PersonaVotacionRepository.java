package com.registraduria.votaciones.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.registraduria.votaciones.Models.PersonaVotacion;
import com.registraduria.votaciones.Models.PersonaVotacionId;

public interface PersonaVotacionRepository extends CrudRepository<PersonaVotacion, PersonaVotacionId> {
}
