/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Entities;

import com.Functions.ShoppingHistory;
import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que almacena los datos por persona.
 * @author AGUSTIN HERNANDEZ
 */
public class Person extends CommonOrganicData{
    
    //Atributo que toma en cuenta el primer apellido.
    private String lastName1;
    //Atributo que toma en cuenta el segundo apellido.
    private String lastName2;
    //Atributo que toma en cuenta la fecha de nacimiento.
    private Date dateBirth;
    //Un usuario puede tener más de una cuenta bancaria
    //(Crédito, Débito, etc...)
    private ArrayList<BankAccount> accounts;
    //Nos crea una variable que guardará y manejará toda la información del historial de compras.
    private ShoppingHistory history;
    
    public Person() {
        super();
        lastName1 = "";
        lastName2 = "";
        dateBirth = new Date();
        accounts = new ArrayList<>();
        history = new ShoppingHistory();
    }

    /**
     * ZONA DE SETTERS Y GETTERS CONSIDERANDO LA METODOLOGÍA DE ENCAPSULAMIENTO.
     */
    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }
    
    
}
