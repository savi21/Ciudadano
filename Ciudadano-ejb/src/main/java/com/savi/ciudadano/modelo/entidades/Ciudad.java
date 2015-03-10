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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author savir_000
 */
@Entity
@Table(name = "CIUDAD")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Ciudad implements Serializable {
 
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Ciudad_ID")
    private BigDecimal ciudadId;
    
    @Size(max = 50)
    @Column(name = "Nombre")
    private String nombre;
  

    public Ciudad() {
    }

    public Ciudad(BigDecimal ciudadId) {
        this.ciudadId = ciudadId;
    }

    public BigDecimal getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(BigDecimal ciudadId) {
        this.ciudadId = ciudadId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    
}
