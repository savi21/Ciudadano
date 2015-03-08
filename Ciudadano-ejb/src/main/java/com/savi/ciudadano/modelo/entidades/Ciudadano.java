/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savi.ciudadano.modelo.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@Table(name = "CIUDADANO")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ciudadano", namespace = "ciudadano")

public class Ciudadano implements Serializable {
  
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @XmlElement(name = "CiudadanoID", nillable = false)
    @Column(name = "CIUDADANO_ID")
    private BigDecimal ciudadanoId;
    
    @Size(max = 50)
    @Column(name = "PRIMER_NOMBRE")
    @XmlElement(name = "PrimerNombre")
    private String primerNombre;
    
    @Size(max = 50)
    @Column(name = "SEGUNDO_NOMBRE")
    @XmlElement(name = "SegundoNombre")
    private String segundoNombre;
    
    @Size(max = 50)
    @Column(name = "PRIMER_APPELLIDO")
    @XmlElement(name = "PrimerApellido")
    private String primerAppellido;
    
    @Size(max = 50)
    @Column(name = "SEGUNDO_APELLIDO")
    @XmlElement(name = "SegundoApellido")
    private String segundoApellido;
    
    @Column(name = "SEXO")
    @XmlElement(name = "PrimerNombre")
    private Character sexo;
    
    @OneToMany(mappedBy = "ciudadanoId")
    @XmlElement(name = "Direcciones")
    private Collection<Direccion> direcciones;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciudadano")
    @XmlElement(name = "Correos")
    private Collection<Correo> correos;
    
    @OneToMany(mappedBy = "ciudadanoId")
    @XmlElement(name = "Telefonos")
    private Collection<Telefono> telefonos;

    public Ciudadano() {
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
