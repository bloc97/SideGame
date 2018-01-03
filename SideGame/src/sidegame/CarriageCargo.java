/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidegame;

/**
 *
 * @author bowen
 */
public class CarriageCargo {
    
    private final int id;
    private final String name;
    private int quantity;

    public CarriageCargo(int id, String name) {
        this(id, name, 0);
    }
    public CarriageCargo(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    
    
    public int getCargoId() {
        return id;
    };
    public String getCargoName() {
        return name;
    };
    
    public int getQuantity() {
        return quantity;
    };
    public void setQuantity(int amount) {
        quantity = amount;
    };
    
    @Override
    public String toString() {
        return name + " (" + quantity + ")";
    }
    
}
