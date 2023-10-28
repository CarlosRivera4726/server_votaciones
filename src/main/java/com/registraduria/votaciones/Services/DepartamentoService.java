package com.registraduria.votaciones.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registraduria.votaciones.Models.Departamento;
import com.registraduria.votaciones.Repositories.DepartamentoRepository;

@Service
public class DepartamentoService {
    @Autowired
    private DepartamentoRepository departamentoRepository;

     public List<Departamento> GetAll(){
        return (List<Departamento>)departamentoRepository.findAll();
    }

    public Optional<Departamento> GetById(Integer id){
        return departamentoRepository.findById(id);
    }

    public void Add(Departamento departamento){
        departamentoRepository.save(departamento);
    }

    public void Update(Departamento departamento){
        departamentoRepository.save(departamento);
    }

    public void Delete(Integer id){
        departamentoRepository.deleteById(id);
    }

}
