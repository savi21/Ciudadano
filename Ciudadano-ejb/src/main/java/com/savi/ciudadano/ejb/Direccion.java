package com.savi.ciudadano.ejb;

import com.savi.ciudadano.ejb.local.DireccionLocal;
import com.savi.ciudadano.ejb.remote.DireccionRemote;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Direccion
 */
@Stateless
@LocalBean
public class Direccion implements DireccionRemote, DireccionLocal {

    /**
     * Default constructor. 
     */
    public Direccion() {
        // TODO Auto-generated constructor stub
    }

}
