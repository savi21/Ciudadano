/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author savir_000
 */
@Entity
public class Continente implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ciudadId;
    
    @Size(max = 50)
    @NotNull
    private String nombre;

    public Continente() {
    }
       
    public Continente(String nombre) {
        this.nombre = nombre;
    }

    public Long getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(Long ciudadId) {
        this.ciudadId = ciudadId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

