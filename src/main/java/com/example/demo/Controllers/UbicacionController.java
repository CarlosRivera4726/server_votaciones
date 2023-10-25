package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Ubicacion;
import com.example.demo.Services.UbicacionService;

@RestController
@RequestMapping(path = "/ubicaciones")
public class UbicacionController {
    @Autowired
    private UbicacionService ubicacionService;

    @GetMapping(path = "")
    public List<Ubicacion> GetAllUbicaciones(){
        return ubicacionService.GetAllUbicaciones();
    }
    
}
