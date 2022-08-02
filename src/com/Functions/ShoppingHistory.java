package com.Functions;

import com.Entities.BillDetails;
import java.util.ArrayList;

/**
 * Información de las diferentes compras que ha realizado un
 * comprador.
 * @author AGUSTIN HERNANDEZ
 */
public class ShoppingHistory {
    
    //Listado que almacenta todas los detalles de las facturas generadas.
    private ArrayList<BillDetails> allUserPurchases;

    public ShoppingHistory() {
        this.allUserPurchases = new ArrayList<>();
    }

    /**
     * Método que nos va a permitir agregar al historial de compras una nueva compra
     * @param newPurchase La nueva compra.
     */
    public void addPurchase(BillDetails newPurchase) {
        this.allUserPurchases.add(newPurchase);
    }
    
    
    /**
     * ZONA DE SETTERS Y GETTERS CONSIDERANDO LA METODOLOGÍA DE ENCAPSULAMIENTO.
     * @return allUserPurchases Todas las compras.
     */
    public ArrayList<BillDetails> getAllUserPurchases() {
        return allUserPurchases;
    }

    public void setAllUserPurchases(ArrayList<BillDetails> allUserPurchases) {
        this.allUserPurchases = allUserPurchases;
    }
}
