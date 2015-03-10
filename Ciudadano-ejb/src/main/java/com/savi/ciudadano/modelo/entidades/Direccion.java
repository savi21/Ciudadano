/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savi.ciudadano.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author savir_000
 */
@Entity
@Table(name = "DIRECCION")
public class Direccion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Direccion_ID")
    private Long direccionId;
    
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Calle")
    private String calle;
    
    @Column(name = "Numero_Domicilio")
    private Long numeroDomicilio;
    
    @JoinColumn(name = "Sector_ID", referencedColumnName = "Sector_ID")
    @OneToOne
    private Sector sectorId;
    
    @JoinColumn(name = "Ciudad_ID", referencedColumnName = "Ciudad_ID")
    @OneToOne
    private Ciudad ciudadId;
    
    @JoinColumn(name = "Pais_ID", referencedColumnName = "Pais_ID")
    @OneToOne
    private Pais paisId;
    
    @JoinColumn(name = "Provincia_ID", referencedColumnName = "Provincia_ID")
    @OneToOne
    private Provincia provinciaId;

    public Direccion() {
    }

    public Direccion(Long direccionId) {
        this.direccionId = direccionId;
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

    public Long getNumeroDomicilio() {
        return numeroDomicilio;
    }

    public void setNumeroDomicilio(Long numeroDomicilio) {
        this.numeroDomicilio = numeroDomicilio;
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

    /**
     * @return the sectorId
     */
    public Sector getSectorId() {
        return sectorId;
    }

    /**
     * @param sectorId the sectorId to set
     */
    public void setSectorId(Sector sectorId) {
        this.sectorId = sectorId;
    }

  
    
}
