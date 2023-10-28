package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Ciudad;

@Repository
public interface CiudadRepository extends CrudRepository<Ciudad, Integer>{
    @Query("SELECT c FROM Ciudad c WHERE c.departamento.id = ?1")
    List<Ciudad> findAllByIdDepartamento(Integer id);
}
