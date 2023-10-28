package com.registraduria.votaciones.Models;



import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "PERSONAS")
public class Persona{ 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", columnDefinition = "BIN_TO_UUID(BINARY(16))")
    private UUID id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "CEDULA")
    private String cedula;

    @ManyToOne
    @JoinColumn(name = "ciudad", referencedColumnName = "ID")
    private Ciudad ciudad;

    @Column(name = "CONTRASEÑA")
    private String contraseña;

 }
