/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Entities;

/**
 * Clase que nos va a permitir heredar atributos y métodos de objetos inánimados o, en este caso,
 * elementos bancarios y compras.
 * @author AGUSTIN HERNANDEZ
 */
public class CommonObjectData {
    
    //Variable encargada de dar a identificar un objeto.
    protected Integer idObject;
    
    public CommonObjectData() {
        idObject = 0;
    }

    /**
     * ZONA DE SETTERS Y GETTERS CONSIDERANDO LA METODOLOGÍA DE ENCAPSULAMIENTO.
     */
    public Integer getIdObject() {
        return idObject;
    }

    public void setIdObject(Integer idObject) {
        this.idObject = idObject;
    }
    
    
}
