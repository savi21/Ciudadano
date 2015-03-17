package com.savi.ciudadano.modelo.entidades;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: Ciudad
 *
 */
@Entity

public class Ciudad implements Serializable {

	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long ciudadId;
	    
	    @Size(max = 50)
	    @NotNull
	    private String nombre;

	    public Ciudad() {
	    }
	       
	    public Ciudad(String nombre) {
	        this.nombre = nombre;
	    }

	    public Long getCiudadId() {
	        return ciudadId;
	    }

	    public void setCiudadId(Long ciudadId) {
	        this.ciudadId = ciudadId;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

   
}
