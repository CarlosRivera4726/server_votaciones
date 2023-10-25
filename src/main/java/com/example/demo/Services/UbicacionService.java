package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Ubicacion;
import com.example.demo.Repositories.UbicacionRepository;

@Service
public class UbicacionService {
    @Autowired
    private UbicacionRepository ubicacionRepository;

    public List<Ubicacion> GetAllUbicaciones(){
        return (List<Ubicacion>) ubicacionRepository.findAll();
    }
    
}
