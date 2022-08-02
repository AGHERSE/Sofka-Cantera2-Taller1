package com.Entities;

/**
 * Clase que determina el estado de una tarjeta bancaria y su
 * idenfiticador o número de cuenta.
 * @author AGUSTIN HERNANDEZ
 */
public class BankAccount extends CommonObjectData{
    
    //Nos define si la cuenta está activada o no.
    private boolean activated;
    
    //Nos define el saldo de la cuenta.
    private float balance;
    
    public BankAccount() {
        //Dentro de la clase CommonObjectData, el atributo idObject nos va a funcionar como
        //identificador de esta clase. Es decir, idObject == accountNumber.
        super();
        activated = false;
        balance = 0;
    }

    /**
     * ZONA DE SETTERS Y GETTERS CONSIDERANDO LA METODOLOGÍA DE ENCAPSULAMIENTO.
     */
    
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
}
