/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savi.controlador;

import com.savi.ciudadano.modelo.entidades.Ciudadano;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author savir_000
 */
@Stateless
public class CiudadanoFacade extends AbstractFacade<Ciudadano> {
    @PersistenceContext(unitName = "com.savi_Ciudadano-web_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CiudadanoFacade() {
        super(Ciudadano.class);
    }
    
}
