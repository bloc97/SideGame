/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidegame;

import java.util.List;

/**
 *
 * @author bowen
 */
public class Carriage {
    private final int maxCondition;
    private int condition;
    
    private final CarriageCargoInventory inventory;
    
    public Carriage(int maxCondition, int maxSlots) {
        this(maxCondition, maxCondition, new CarriageCargoInventory(maxSlots));
    }
    
    public Carriage(int maxCondition, int condition, CarriageCargoInventory inventory) {
        this.maxCondition = maxCondition;
        this.condition = condition;
        this.inventory = inventory;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        if (condition > maxCondition) {
            condition = maxCondition;
        } else if (condition < 0) {
            condition = 0;
        }
        this.condition = condition;
    }
    
    public void addCondition(int value) {
        setCondition(getCondition() + value);
    }
    
    public int getMaxCondition() {
        return maxCondition;
    }

    public CarriageCargoInventory getInventory() {
        return inventory;
    }
    
}
