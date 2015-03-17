package com.savi.ciudadano.ejb;

import java.util.List;

import com.savi.ciudadano.ejb.local.CorreoLocal;
import com.savi.ciudadano.ejb.remote.CorreoRemote;
import com.savi.ciudadano.modelo.ServicioDAO;
import com.savi.ciudadano.modelo.entidades.Ciudad;
import com.savi.ciudadano.modelo.entidades.Correo;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class Correo
 */
@Stateless
@LocalBean
public class CorreoImpl implements CorreoRemote, CorreoLocal {

    /**
     * Default constructor. 
     */

	ServicioDAO<Correo> servicio;
	
	@PersistenceContext(unitName="Ciudadano")
	EntityManager em;
	
    public CorreoImpl() {
        // TODO Auto-generated constructor stub
    }
    
    @PostConstruct
    public void postConstruct(){
    	 
    	servicio = new ServicioDAO<Correo>(Correo.class);
        servicio.setEm(em);
        
    }
    

	@Override
	public void guardar(Correo entidad) {
		// TODO Auto-generated method stub
		servicio.create(entidad);
	}

	@Override
	public boolean actualizar(Correo entidad) {
		// TODO Auto-generated method stub
		return servicio.edit(entidad);
	}

	@Override
	public void delete(Correo entidad) {
		// TODO Auto-generated method stub
		servicio.remove(entidad);
	}

	@Override
	public Correo buscar(Long entidadID) {
		// TODO Auto-generated method stub
		return servicio.find(entidadID);
	}

	@Override
	public List<Correo> buscarTodos() {
		// TODO Auto-generated method stub
		return servicio.findAll();
	}

	@Override
	public List<Correo> buscarRango(int[] rango) {
		// TODO Auto-generated method stub
		return servicio.findRange(rango);
	}
}
