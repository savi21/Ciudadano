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
    @Column(name = "CIUDAD_ID")
    private BigDecimal ciudadId;
    
    @Size(max = 50)
    @Column(name = "NOMBRE")
    @XmlElement(name = "Nombre")
    private String nombre;
    
    @OneToMany(mappedBy = "ciudadId")    
    @XmlElement(name = "dorecciones")
    private Collection<Direccion> direcciones;
   
    @JoinColumn(name = "PROVINCIA_ID", referencedColumnName = "PROVINCIA_ID")
    @ManyToOne    
    @XmlElement(name = "Provincia")
    private Provincia provinciaId;

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

    @XmlTransient
    public Collection<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Collection<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public Provincia getProvinciaId() {
        return provinciaId;
    }

    public void setProvinciaId(Provincia provinciaId) {
        this.provinciaId = provinciaId;
    }
    
}
