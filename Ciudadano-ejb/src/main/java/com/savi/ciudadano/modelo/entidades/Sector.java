package com.savi.ciudadano.modelo.entidades;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Sector
 *
 */
@Entity

public class Sector implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long sectorId;

	    public Sector() {
	    	
	    }

	    public Long getId() {
	        return sectorId;
	    }

	    public Sector(String nombre) {
	        this.nombre = nombre;
	    }

	    
	    @NotNull
	    private String nombre;

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	            
	    public void setId(Long id) {
	        this.sectorId = id;
	    }
}
