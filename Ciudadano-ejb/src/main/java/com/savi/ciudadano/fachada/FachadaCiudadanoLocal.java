/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savi.ciudadano.fachada;

import com.savi.ciudadano.modelo.entidades.Ciudadano;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author savir_000
 */
@Local
public interface FachadaCiudadanoLocal {
    public abstract void guardar(Ciudadano ciudadano);
 
    public abstract Ciudadano actualizar(Ciudadano ciudadano);
 
    public abstract void borrar(Ciudadano ciudadano);
 
    public abstract Ciudadano buscar(int entityID);
 
    public abstract List<Ciudadano> buscarTodos();
    
    public abstract List<Ciudadano> buscarRango(int[] range);
    
    public abstract int contar();
}
