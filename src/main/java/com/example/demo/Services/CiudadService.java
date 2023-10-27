package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Ciudad;
import com.example.demo.Repositories.CiudadRepository;

@Service
public class CiudadService {
    @Autowired
    private CiudadRepository ciudadRepository;

     public List<Ciudad> GetAll(){
        return (List<Ciudad>)ciudadRepository.findAll();
    }

    public Optional<Ciudad> GetById(Integer id){
        return ciudadRepository.findById(id);
    }

    public void Add(Ciudad ciudad){
        ciudadRepository.save(ciudad);
    }

    public void Update(Ciudad ciudad){
        ciudadRepository.save(ciudad);
    }

    public void Delete(Integer id){
        ciudadRepository.deleteById(id);
    }
}
