package com.savi.ciudadano.ejb.local;

import javax.ejb.Local;

import com.savi.ciudadano.modelo.entidades.Correo;
import com.savi.ciudadano.modelo.entidades.Fachada;

@Local
public interface CorreoLocal extends Fachada<Correo> {

}
