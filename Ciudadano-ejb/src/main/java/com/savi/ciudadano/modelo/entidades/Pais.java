/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savi.ciudadano.modelo.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author savir_000
 */
@Entity
@Table(name = "PAIS")
public class Pais implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull    
    @Column(name = "Pais_ID")
    private Long paisId;
    
    @Size(max = 50)
    @Column(name = "Nombre")
    private String nombre;
    
    @OneToMany()
    private Collection<Provincia> provincias;

    public Pais() {
    }

    public Pais(Long paisId) {
        this.paisId = paisId;
    }

    public Long getPaisId() {
        return paisId;
    }

    public void setPaisId(Long paisId) {
        this.paisId = paisId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(Collection<Provincia> provincias) {
        this.provincias = provincias;
    }

    
}
