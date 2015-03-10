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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author savir_000
 */
@Entity
@Table(name = "CIUDADANO")
public class Ciudadano implements Serializable {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Ciudadano_ID")
    private BigDecimal ciudadanoId;
    
    @Size(max = 50)
    @NotNull
    @Column(name = "Primer_Nombre")
    private String primerNombre;
    
    @Size(max = 50)
    @Column(name = "Segundo_Nombre")
    private String segundoNombre;
    
    @Size(max = 50)
    @NotNull
    @Column(name = "Primer_Apellido")
    private String primerAppellido;
    
    @Size(max = 50)
    @Column(name = "Segundo_Apellido")
    private String segundoApellido;
    
    @Column(name = "Sexo")
    @NotNull
    private Character sexo;
    
     @JoinColumn(name = "Direccion_ID", referencedColumnName = "Direccion_ID")
    @ManyToOne 
    private Direccion direccion;

    @OneToMany()
    private Collection<Telefono> telefonos;
    
    @OneToMany()
    private Collection<Correo> correos;

    public Ciudadano() {
    }

    public Ciudadano(String primerNombre, String primerAppellido, Character sexo) {
        this.primerNombre = primerNombre;
        this.primerAppellido = primerAppellido;
        this.sexo = sexo;
    }
    
    public Ciudadano(BigDecimal ciudadanoId) {
        this.ciudadanoId = ciudadanoId;
    }

    public BigDecimal getCiudadanoId() {
        return ciudadanoId;
    }

    public void setCiudadanoId(BigDecimal ciudadanoId) {
        this.ciudadanoId = ciudadanoId;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerAppellido() {
        return primerAppellido;
    }

    public void setPrimerAppellido(String primerAppellido) {
        this.primerAppellido = primerAppellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Collection<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Collection<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    /**
     * @return the direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the correos
     */
    public Collection<Correo> getCorreos() {
        return correos;
    }

    /**
     * @param correos the correos to set
     */
    public void setCorreos(Collection<Correo> correos) {
        this.correos = correos;
    }

}
