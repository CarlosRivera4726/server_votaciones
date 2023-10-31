package com.registraduria.votaciones.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registraduria.votaciones.Models.Votacion;
import com.registraduria.votaciones.Services.VotacionService;

@RestController
@RequestMapping(path = "/votaciones")
@CrossOrigin
public class VotacionController {
    @Autowired
    VotacionService votacionService;


    @GetMapping(path = "")
    public List<Votacion> get(){
        return votacionService.getAll();
    }

}
