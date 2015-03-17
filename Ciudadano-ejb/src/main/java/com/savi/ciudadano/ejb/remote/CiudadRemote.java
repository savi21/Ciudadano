package com.savi.ciudadano.ejb.remote;

import javax.ejb.Remote;

import com.savi.ciudadano.modelo.entidades.Ciudad;
import com.savi.ciudadano.modelo.entidades.Fachada;

@Remote
public interface CiudadRemote extends Fachada<Ciudad>{

}
