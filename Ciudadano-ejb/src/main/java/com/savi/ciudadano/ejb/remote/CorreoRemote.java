package com.savi.ciudadano.ejb.remote;

import javax.ejb.Remote;

import com.savi.ciudadano.modelo.entidades.Correo;
import com.savi.ciudadano.modelo.entidades.Fachada;

@Remote
public interface CorreoRemote extends Fachada<Correo>{

}
