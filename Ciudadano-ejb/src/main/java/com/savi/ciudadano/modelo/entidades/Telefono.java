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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author savir_000
 */
@Entity
@Table(name = "TELEFONO")
public class Telefono implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "Telefono_ID")
    private Long telefonoId;
    
    @Size(max = 50)
    @Column(name = "Numero")
    private String numero;
    

    public Telefono() {
    }

    public Telefono(Long telefonoId) {
        this.telefonoId = telefonoId;
    }

    public Long getTelefonoId() {
        return telefonoId;
    }

    public void setTelefonoId(Long telefonoId) {
        this.telefonoId = telefonoId;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
