/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savi.ciudadano.modelo.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author savir_000
 */
@Entity
@Table(name = "TELEFONO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(name = "Telefono", namespace = "telefono")
public class Telefono implements Serializable {
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TELEFONO_ID")
    private BigDecimal telefonoId;
    @Size(max = 50)
    @Column(name = "NUMERO")
    private String numero;
    @JoinColumn(name = "CIUDADANO_ID", referencedColumnName = "CIUDADANO_ID")
    @ManyToOne
    private Ciudadano ciudadanoId;

    public Telefono() {
    }

    public Telefono(BigDecimal telefonoId) {
        this.telefonoId = telefonoId;
    }

    public BigDecimal getTelefonoId() {
        return telefonoId;
    }

    public void setTelefonoId(BigDecimal telefonoId) {
        this.telefonoId = telefonoId;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Ciudadano getCiudadanoId() {
        return ciudadanoId;
    }

    public void setCiudadanoId(Ciudadano ciudadanoId) {
        this.ciudadanoId = ciudadanoId;
    }

 
    
}
