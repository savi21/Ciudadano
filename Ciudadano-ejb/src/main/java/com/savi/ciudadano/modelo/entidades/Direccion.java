/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.savi.ciudadano.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author srodriguez
 */
@Entity
public class Direccion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long direccionId;
    
    @NotNull
    @Size(min = 1, max = 100)
    private String calle;
    
    private int numeroDomicilio;
    
    @NotNull
    @Size(min = 1, max = 100)
    
    @JoinColumn(name = "sectorId", referencedColumnName = "sectorId")
    @ManyToOne
    private Sector sector;

    private Sector getSector() {
        return sector;
    }
    @JoinColumn(name = "ciudadId", referencedColumnName = "ciudadId")
    @ManyToOne
    private Ciudad ciudadId;
    @JoinColumn(name = "paisId", referencedColumnName = "paisId")
    @ManyToOne
    private Pais paisId;
    @JoinColumn(name = "provinciaId", referencedColumnName = "provinciaId")
    @ManyToOne
    private Provincia provinciaId;

    public Direccion() {
    }

 
    public Direccion( String calle, Sector sector) {
        this.calle = calle;
        this.sector = sector;
    }

    public Long getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(Long direccionId) {
        this.direccionId = direccionId;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroDomicilio() {
        return numeroDomicilio;
    }

    public void setNumeroDomicilio(int numeroDomicilio) {
        this.numeroDomicilio=numeroDomicilio;
    }

  

    public void setSector(Sector sector) {
        this.sector=sector;
    }

    public Ciudad getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(Ciudad ciudadId) {
        this.ciudadId = ciudadId;
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
