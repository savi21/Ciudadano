/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savi.ciudadano.modelo;

import com.savi.ciudadano.modelo.entidades.Telefono;
import javax.ejb.Stateless;

/**
 *
 * @author savir_000
 */
@Stateless
public class TelefonoDAO extends ServicioDAO<Telefono> {

    public TelefonoDAO() {
        super(Telefono.class);
    }
    
}
