package com.savi.ciudadano.ejb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.savi.ciudadano.ejb.remote.CiudadRemote;
import com.savi.ciudadano.ejb.local.CiudadLocal;
import com.savi.ciudadano.modelo.ServicioDAO;
import com.savi.ciudadano.modelo.entidades.Ciudad;
/**
 * Session Bean implementation class Ciudad
 */
@Stateless
@LocalBean
public class CiudadImpl implements CiudadRemote, CiudadLocal {

    /**
     * Default constructor. 
     */

	ServicioDAO<Ciudad> servicio;
	
	@PersistenceContext(unitName="Ciudadano")
	EntityManager em;
	
    public CiudadImpl() {
        // TODO Auto-generated constructor stub
    }
    
    @PostConstruct
    public void postConstruct(){
    	 
    	servicio = new ServicioDAO<Ciudad>(Ciudad.class);
        servicio.setEm(em);
        
    }
    

	@Override
	public void guardar(Ciudad entidad) {
		// TODO Auto-generated method stub
		servicio.create(entidad);
	}

	@Override
	public boolean actualizar(Ciudad entidad) {
		// TODO Auto-generated method stub
		return servicio.edit(entidad);
	}

	@Override
	public void delete(Ciudad entidad) {
		// TODO Auto-generated method stub
		servicio.remove(entidad);
	}

	@Override
	public Ciudad buscar(Long entidadID) {
		// TODO Auto-generated method stub
		return servicio.find(entidadID);
	}

	@Override
	public List<Ciudad> buscarTodos() {
		// TODO Auto-generated method stub
		return servicio.findAll();
	}

	@Override
	public List<Ciudad> buscarRango(int[] rango) {
		// TODO Auto-generated method stub
		return servicio.findRange(rango);
	}

}
