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
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author savir_000
 */
@Embeddable
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(name = "CorreoPrimaryKey")
public class CorreoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "CORREO_ID")
    private BigInteger correoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CIUDADANO_ID")
    private BigInteger ciudadanoId;

    public CorreoPK() {
    }

    public CorreoPK(BigInteger correoId, BigInteger ciudadanoId) {
        this.correoId = correoId;
        this.ciudadanoId = ciudadanoId;
    }

    public BigInteger getCorreoId() {
        return correoId;
    }

    public void setCorreoId(BigInteger correoId) {
        this.correoId = correoId;
    }

    public BigInteger getCiudadanoId() {
        return ciudadanoId;
    }

    public void setCiudadanoId(BigInteger ciudadanoId) {
        this.ciudadanoId = ciudadanoId;
    }

  
}
