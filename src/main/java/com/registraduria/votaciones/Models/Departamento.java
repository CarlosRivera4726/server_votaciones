package com.registraduria.votaciones.Models;

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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "departamentos")
public class Departamento {
    @Id
    @Column(name = "ID")
    public Integer id;

    @Column(name = "NOMBRE")
    public String nombre;

    @JsonIgnore
    @OneToMany(mappedBy = "departamento")
    public List<Ciudad> ciudades;

}
