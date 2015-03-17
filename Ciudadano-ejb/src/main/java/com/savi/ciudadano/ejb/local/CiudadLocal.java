package com.savi.ciudadano.ejb.local;

import javax.ejb.Local;

import com.savi.ciudadano.modelo.entidades.Ciudad;
import com.savi.ciudadano.modelo.entidades.Fachada;

@Local
public interface CiudadLocal extends Fachada<Ciudad>{

}
