/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.savi.ciudadano.ejb;

import com.savi.ciudadano.ejb.remote.CiudadanoRemota;
import com.savi.ciudadano.ejb.local.CiudadanoLocal;
import com.savi.ciudadano.modelo.ServicioDAO;
import com.savi.ciudadano.modelo.entidades.Ciudadano;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author srodriguez
 */
@Stateless
public class CiudadanoImpl implements CiudadanoRemota,CiudadanoLocal {

   
    ServicioDAO<Ciudadano> servicio;
    
    @PersistenceContext(unitName = "Ciudadano")
    private EntityManager em;


    public CiudadanoImpl() {
       
    }
    
    @PostConstruct
    public void postConstruct(){
    	 
    	servicio = new ServicioDAO<Ciudadano>(Ciudadano.class);
        servicio.setEm(em);
        
    }
    
    public void guardar(Ciudadano entidad) {
        servicio.create(entidad);
    }

    public boolean actualizar(Ciudadano entidad) {
       return servicio.edit(entidad);
    }

    public void delete(Ciudadano entidad) {
       servicio.remove(entidad);
    }

    public Ciudadano buscar(Long entidadID) {
       return servicio.find(entidadID);
    }

    public List<Ciudadano> buscarTodos() {
       return servicio.findAll();
    }

    public List<Ciudadano> buscarRango(int[] rango) {
        return servicio.findRange(rango);
    }

	
}
