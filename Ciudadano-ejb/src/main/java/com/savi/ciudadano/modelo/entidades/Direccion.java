/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savi.ciudadano.modelo.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author savir_000
 */
@Entity
@Table(name = "DIRECCION")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(name = "Direccion",namespace = "direccion")
public class Direccion implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @XmlElement(name = "DireccionID", nillable = false)
    @Column(name = "DIRECCION_ID")
    private BigDecimal direccionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CALLE")
    private String calle;
    @Column(name = "NUMERO_DOMICILIO")
    private BigInteger numeroDomicilio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "SECTOR")
    private String sector;
    @JoinColumn(name = "CIUDAD_ID", referencedColumnName = "CIUDAD_ID")
    @ManyToOne
    private Ciudad ciudadId;
    @JoinColumn(name = "CIUDADANO_ID", referencedColumnName = "CIUDADANO_ID")
    @ManyToOne
    private Ciudadano ciudadanoId;
    @JoinColumn(name = "PAIS_ID", referencedColumnName = "PAIS_ID")
    @ManyToOne
    private Pais paisId;
    @JoinColumn(name = "PROVINCIA_ID", referencedColumnName = "PROVINCIA_ID")
    @ManyToOne
    private Provincia provinciaId;

    public Direccion() {
    }

    public Direccion(BigDecimal direccionId) {
        this.direccionId = direccionId;
    }

    public Direccion(BigDecimal direccionId, String calle, String sector) {
        this.direccionId = direccionId;
        this.calle = calle;
        this.sector = sector;
    }

    public BigDecimal getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(BigDecimal direccionId) {
        this.direccionId = direccionId;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public BigInteger getNumeroDomicilio() {
        return numeroDomicilio;
    }

    public void setNumeroDomicilio(BigInteger numeroDomicilio) {
        this.numeroDomicilio = numeroDomicilio;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Ciudad getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(Ciudad ciudadId) {
        this.ciudadId = ciudadId;
    }

    public Ciudadano getCiudadanoId() {
        return ciudadanoId;
    }

    public void setCiudadanoId(Ciudadano ciudadanoId) {
        this.ciudadanoId = ciudadanoId;
    }

    public Pais getPaisId() {
        return paisId;
    }

    public void setPaisId(Pais paisId) {
        this.paisId = paisId;
    }

    public Provincia getProvinciaId() {
        return provinciaId;
    }

    public void setProvinciaId(Provincia provinciaId) {
        this.provinciaId = provinciaId;
    }

  
    
}
