package com.Entities;

import java.util.ArrayList;

/**
 * Clase que me determina los diferentes tipos de colores y
 * los datos en general de una fruta.
 * @author AGUSTIN HERNANDEZ
 */
public class Fruit extends CommonOrganicData{
    
    //Nos toma en cuenta la cantidad de colores que puede tener una fruta.
    private ArrayList<String> colors;
    
    public Fruit() {
        super();
        colors = new ArrayList<>();
    }

    
    /**
     * ZONA DE SETTERS Y GETTERS CONSIDERANDO LA METODOLOGÍA DE ENCAPSULAMIENTO.
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
    
    
}
