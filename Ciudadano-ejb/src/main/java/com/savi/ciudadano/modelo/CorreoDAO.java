/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savi.ciudadano.modelo;

import com.savi.ciudadano.modelo.entidades.Correo;
import javax.ejb.Stateless;

/**
 *
 * @author savir_000
 */
@Stateless
public class CorreoDAO extends ServicioDAO<Correo> {

    public CorreoDAO() {
        super(Correo.class);
    }
    
}
