/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savi.ciudadano.modelo.entidades;

import java.util.List;

/**
 *
 * @author srodriguez
 * @param <E>
 */
public interface Fachada<E> {

    void guardar(E entidad);

    boolean actualizar(E entidad);

    void delete(E entidad);

    E buscar(Long entidadID);

    List<E> buscarTodos();

    List<E> buscarRango(int[] rango);

}
