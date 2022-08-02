/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Functions;

import com.Entities.Person;
import java.util.ArrayList;

/**
 * Nos crea una lista de personas que tiene dentro de un programa.
 * @author AGUSTIN HERNANDEZ
 */
public class RegisteredUsersData {
    
    //Toma en cuenta solo a los usuarios registrados.
    private ArrayList<Person> registeredUsers;
    
    
    public RegisteredUsersData(){
        registeredUsers = new ArrayList<>();
    }

    /**
     * ZONA DE SETTERS Y GETTERS CONSIDERANDO LA METODOLOGÍA DE ENCAPSULAMIENTO.
     */
    public ArrayList<Person> getRegisteredUsers() {
        return registeredUsers;
    }

    public void setRegisteredUsers(ArrayList<Person> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }
    
    
    
}
