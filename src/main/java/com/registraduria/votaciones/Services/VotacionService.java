package com.registraduria.votaciones.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registraduria.votaciones.Models.Votacion;
import com.registraduria.votaciones.Repositories.VotacionRepository;

@Service
public class VotacionService {
    @Autowired
    VotacionRepository votacionRepository;

    public List<Votacion> getAll(){
        return (List<Votacion>)votacionRepository.findAll();
    }
}
