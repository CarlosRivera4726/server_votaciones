package com.registraduria.votaciones.Models;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
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
@Table(name = "personas_votaciones")


public class PersonaVotacion {

    @EmbeddedId
    private PersonaVotacionId id;

    @ManyToOne
    @JoinColumn(name = "PERSONA", referencedColumnName = "ID", insertable = false, updatable = false)   
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "VOTACION", referencedColumnName = "ID", insertable = false, updatable = false)
    private Votacion votacion;

    @Column(name = "DISPONIBLE")
    private boolean disponible;
    
}
