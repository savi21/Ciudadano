/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.savi.ciudadano.ejb.remote;

import javax.ejb.Remote;

import com.savi.ciudadano.modelo.entidades.Ciudadano;
import com.savi.ciudadano.modelo.entidades.Fachada;

/**
 *
 * @author srodriguez
 */
@Remote
public interface CiudadanoRemota extends Fachada<Ciudadano>{
    
}
