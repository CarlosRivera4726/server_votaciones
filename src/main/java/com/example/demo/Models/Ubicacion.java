package com.example.demo.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "UBICACIONES")
public class Ubicacion {
    @Id
    @Column(name = "ID")
    private Integer id;
    
    @Column(name = "DEPARTAMENTO")
    private String departamento;

    @Column(name = "CIUDAD")
    private String ciudad;

    @OneToMany(mappedBy = "ubicacion")
    @JsonIgnore
    private List<Persona> personas;
}
