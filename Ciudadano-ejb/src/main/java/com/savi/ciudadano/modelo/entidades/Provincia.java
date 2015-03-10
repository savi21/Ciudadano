/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savi.ciudadano.modelo.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "PROVINCIA")
public class Provincia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "Provincia_ID")
    private BigDecimal provinciaId;
    
    @Size(max = 50)
    @Column(name = "Nombre")
    private String nombre;
    
    @OneToMany()
    private Collection<Ciudad> ciudades;

    public Provincia() {
    }

    public Provincia(BigDecimal provinciaId) {
        this.provinciaId = provinciaId;
    }

    public BigDecimal getProvinciaId() {
        return provinciaId;
    }

    public void setProvinciaId(BigDecimal provinciaId) {
        this.provinciaId = provinciaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(Collection<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
    
}
