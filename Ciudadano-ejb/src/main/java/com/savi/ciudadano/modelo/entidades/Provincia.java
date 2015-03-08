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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "PROVINCIA")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(name = "Provincia", namespace = "provincia")
public class Provincia implements Serializable {
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROVINCIA_ID")
    private BigDecimal provinciaId;
    @Size(max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(mappedBy = "provinciaId")
    private Collection<Direccion> direcciones;
    @JoinColumn(name = "PAIS_ID", referencedColumnName = "PAIS_ID")
    @ManyToOne
    private Pais paisId;
    @OneToMany(mappedBy = "provinciaId")
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
    public Collection<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Collection<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public Pais getPaisId() {
        return paisId;
    }

    public void setPaisId(Pais paisId) {
        this.paisId = paisId;
    }

    @XmlTransient
    public Collection<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(Collection<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
    
}
