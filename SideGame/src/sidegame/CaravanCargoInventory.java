/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidegame;

import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author bowen
 */
public class CaravanCargoInventory {
    private final int maxQuantity;
    private final List<CaravanCargo> cargoList = new LinkedList<>();

    public CaravanCargoInventory(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }
    
    /**
     * @return Maximum inventory space for cargo.
     */
    public int getMaxQuantity() {
        return maxQuantity;
    }
    
    /**
     * @return Current space used by cargo in inventory.
     */
    public int getCurrentQuantity() {
        int sum = 0;
        for (CaravanCargo cargo : cargoList) {
            sum += cargo.getQuantity();
        }
        return sum;
    }

    /**
     * @return Remaining free space in inventory.
     */
    public int getRemainingQuantity() {
        return getMaxQuantity() - getCurrentQuantity();
    }
    
    /**
     * Adds cargo to the inventory
     * @param cargo Cargo type and quantity to add
     * @return True if successfully added cargo, False if there is not enough space.
     */
    public boolean addCargo(CaravanCargo cargo) {
        if (cargo.getQuantity() <= getRemainingQuantity()) {
            for (CaravanCargo cargoInList : cargoList) {
                if (cargoInList.getCargoId() == cargo.getCargoId()) {
                    cargoInList.setQuantity(cargoInList.getQuantity() + cargo.getQuantity());
                    return true;
                }
            }
            cargoList.add(cargo);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Removes cargo from the inventory
     * @param cargo Cargo type and quantity to remove
     * @return True if successfully removed cargo, False if cargo does not exist or do not have enough cargo to remove.
     */
    public boolean removeCargo(CaravanCargo cargo) {
        for (CaravanCargo cargoInList : cargoList) {
            if (cargoInList.getCargoId() == cargo.getCargoId()) {
                if (cargoInList.getQuantity() > cargo.getQuantity()) { //If there is more in cargo than what to remove
                    cargoInList.setQuantity(cargoInList.getQuantity() - cargo.getQuantity()); //Remove quantity
                } else if (cargoInList.getQuantity() == cargo.getQuantity()) { //If the quantity is exact
                    cargoList.remove(cargoInList); //Remove the object from list
                } else { //Can't remove more than what you have
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return getCurrentQuantity() + "/" + getMaxQuantity() + " " + cargoList.toString();
    }
    
}
