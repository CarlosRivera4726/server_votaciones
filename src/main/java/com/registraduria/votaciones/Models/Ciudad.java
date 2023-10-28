package com.registraduria.votaciones.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "CIUDADES")
public class Ciudad {
    @Id
    @Column(name = "ID")
    public Integer id;

    @Column(name = "nombre")
    public String nombre;

    @ManyToOne
    @JoinColumn(name = "departamento", referencedColumnName = "ID")
    public Departamento departamento;

    @JsonIgnore
    @OneToMany(mappedBy = "ciudad")
    public List<Persona> personas;
    
}
