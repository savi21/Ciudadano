/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savi.ciudadano.fachada.impl;

import com.savi.ciudadano.fachada.FachadaCiudadanoLocal;
import com.savi.ciudadano.modelo.ServicioDAO;
import com.savi.ciudadano.modelo.entidades.Ciudadano;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author savir_000
 */
@Stateless
public class FachadaCiudadano implements FachadaCiudadanoLocal {
    
    @EJB
    private ServicioDAO<Ciudadano> ciudadanoDAO;

    @Override
    public void guardar(Ciudadano ciudadano) {
        ciudadanoDAO.create(ciudadano);
    }

    @Override
    public Ciudadano actualizar(Ciudadano ciudadano) {        
        return ciudadanoDAO.edit(ciudadano);
    }

    @Override
    public void borrar(Ciudadano ciudadano) {
        ciudadanoDAO.remove(ciudadano);
    }

    @Override
    public Ciudadano buscar(int entityID) {
       return ciudadanoDAO.find(entityID);
    }

    @Override
    public List<Ciudadano> buscarTodos() {
       return ciudadanoDAO.findAll();
    }

    @Override
    public List<Ciudadano> buscarRango(int[] range) {
       return ciudadanoDAO.findRange(range);
    }

    @Override
    public int contar() {
        return ciudadanoDAO.count();
    }
    
    
}
