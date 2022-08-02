package com.Entities;

import com.Entities.BankAccount;
import com.Entities.Fruit;
import java.util.ArrayList;

/**
 * Clase que nos permite almacenar los detalles de una compra de alguna fruta.
 * @author AGUSTIN HERNANDEZ
 */

public class BillDetails extends CommonObjectData{
    
    //Representa una lista de productos que se han escogido para la compra.
    private ArrayList<Fruit> products;
    
    //Se crea una variable que tome en cuenta un método de pago a partir de una cuenta bancaria.
    private BankAccount paymentMethod;
    
    public BillDetails(BankAccount paymentMethod){
        super();
        products = new ArrayList<>();
        this.paymentMethod = paymentMethod;
    }

    
    /**
     * ZONA DE SETTERS Y GETTERS CONSIDERANDO LA METODOLOGÍA DE ENCAPSULAMIENTO.
     */
    public ArrayList<Fruit> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Fruit> products) {
        this.products = products;
    }

    public BankAccount getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(BankAccount paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    
}
