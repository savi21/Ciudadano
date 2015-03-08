/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savi.ciudadano.modelo.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author savir_000
 */
@Entity
@Table(name = "PAIS")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(name = "Pais", namespace = "pais")
public class Pais implements Serializable {
  @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAIS_ID")
    private BigDecimal paisId;
    @Size(max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(mappedBy = "paisId")
    private Collection<Direccion> direcciones;
    @OneToMany(mappedBy = "paisId")
    private Collection<Provincia> provincias;

    public Pais() {
    }

    public Pais(BigDecimal paisId) {
        this.paisId = paisId;
    }

    public BigDecimal getPaisId() {
        return paisId;
    }

    public void setPaisId(BigDecimal paisId) {
        this.paisId = paisId;
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

    @XmlTransient
    public Collection<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(Collection<Provincia> provincias) {
        this.provincias = provincias;
    }

    
}
