package com.registraduria.votaciones.Models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Table(name = "VOTACIONES")
public class Votacion {
    @Id
    Integer id;

    @Column(name = "TIPO")
    String tipo;

    @Column(name = "FECHA")
    String fecha;

    //@ManyToOne
    //List<PersonaVotacion> personaVotacions;

}
