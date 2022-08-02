/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Entities;

/**
 * Nos toma en cuenta los datos comunes que pueden tener los 
 * objetos orgánicos (Nombre, familia, edad, etc...)
 * @author AGUSTIN HERNANDEZ
 */
public class CommonOrganicData {
    
    //Tanto una persona como una fruta tienen un peso promedio.
    protected float averageWeight;
    //Tanto una persona como otro objeto tiene que tener una altura promedio.
    protected float averageHeight;
    //Cualquier objeto orgánico puede tener un nombre.
    protected String name;
    
    public CommonOrganicData() {
        averageHeight = 0;
        averageWeight = 0;
        name = "";
    }

    /**
     * ZONA DE SETTERS Y GETTERS CONSIDERANDO LA METODOLOGÍA DE ENCAPSULAMIENTO.
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public float getAverageHeight() {
        return averageHeight;
    }

    public void setAverageHeight(float averageHeight) {
        this.averageHeight = averageHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
