/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savi.ciudadano.modelo.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author savir_000
 */
@Entity
@Table(name = "CORREO")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(name = "Correo", namespace = "correo")
public class Correo implements Serializable {
    @EmbeddedId
    protected CorreoPK correoPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DIRECCION")
    private String direccion;
    @JoinColumn(name = "CIUDADANO_ID", referencedColumnName = "CIUDADANO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ciudadano ciudadano;

    public Correo() {
    }

    public Correo(CorreoPK correoPK) {
        this.correoPK = correoPK;
    }

    public Correo(CorreoPK correoPK, String direccion) {
        this.correoPK = correoPK;
        this.direccion = direccion;
    }

    public Correo(BigInteger correoId, BigInteger ciudadanoId) {
        this.correoPK = new CorreoPK(correoId, ciudadanoId);
    }

    public CorreoPK getCorreoPK() {
        return correoPK;
    }

    public void setCorreoPK(CorreoPK correoPK) {
        this.correoPK = correoPK;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

 
   
}
