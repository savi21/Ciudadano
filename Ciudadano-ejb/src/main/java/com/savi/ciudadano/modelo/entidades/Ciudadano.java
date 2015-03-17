/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.savi.ciudadano.modelo.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author srodriguez
 */
@Entity
public class Ciudadano implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ciudadanoId;

    public Long getId() {
        return ciudadanoId;
    }

    public void setId(Long id) {
        this.ciudadanoId = id;
    }

    @Size(max = 50)
    @NotNull
    private String primerNombre;
    
    @Size(max = 50)
    private String segundoNombre;
    
    @Size(max = 50)
    @NotNull
    private String primerAppellido;
    
    @Size(max = 50)
    private String segundoApellido;
    
    private Character sexo;
    
    @OneToMany
    private Collection<Direccion> direcciones;
    
    @OneToMany
    private Collection<Correo> correos;
    
    @OneToMany
    private Collection<Telefono> telefonos;

    public Ciudadano() {
    }

    public Ciudadano(String primerNombre, String primerAppellido, Character sexo) {
        this.primerNombre = primerNombre;
        this.primerAppellido = primerAppellido;
        this.sexo = sexo;
    }

    public Long getCiudadanoId() {
        return ciudadanoId;
    }

    public void setCiudadanoId(Long ciudadanoId) {
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

   
    public Collection<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Collection<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

  
    public Collection<Correo> getCorreos() {
        return correos;
    }

    public void setCorreos(Collection<Correo> correos) {
        this.correos = correos;
    }

    public Collection<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Collection<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    
}
