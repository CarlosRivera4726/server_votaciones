package com.registraduria.votaciones.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.registraduria.votaciones.Models.Ciudad;

@Repository
public interface CiudadRepository extends CrudRepository<Ciudad, Integer> {
    @Query("SELECT c FROM Ciudad c WHERE c.departamento.id = ?1")
    Optional<Ciudad> findAllByIdDepartamento(Integer id);
}
