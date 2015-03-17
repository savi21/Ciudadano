/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.savi.ciudadano.ejb.local;

import com.savi.ciudadano.modelo.entidades.Ciudadano;
import com.savi.ciudadano.modelo.entidades.Fachada;

import javax.ejb.Local;

/**
 *
 * @author srodriguez
 */
@Local
public interface CiudadanoLocal extends Fachada<Ciudadano>{
    
}
