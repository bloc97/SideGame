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
public class CargoTest {
    
    public static void main(String[] args) {
        int coalID = 0;
        int woodID = 1;
        int beerID = 2;
        
        CarriageCargoInventory inventory = new CarriageCargoInventory(6);
        
        System.out.println("Bought 5 coal");
        inventory.addCargo(new CarriageCargo(coalID, "Coal", 5));
        System.out.println(inventory + "\n");
        
        System.out.println("Bought 1 wood");
        inventory.addCargo(new CarriageCargo(woodID, "Wood", 1));
        System.out.println(inventory + "\n");
        
        System.out.println("Tried to sell 6 coal");
        inventory.removeCargo(new CarriageCargo(coalID, "Coal", 6));
        System.out.println(inventory + "\n");
        
        System.out.println("Sold 4 coal");
        inventory.removeCargo(new CarriageCargo(coalID, "Coal", 4));
        System.out.println(inventory + "\n");
        
        System.out.println("Tried to buy 5 beer");
        inventory.addCargo(new CarriageCargo(beerID, "Beer", 5));
        System.out.println(inventory + "\n");
        
        System.out.println("Bought 4 beer");
        inventory.addCargo(new CarriageCargo(beerID, "Beer", 4));
        System.out.println(inventory + "\n");
        
        
        
        
    }
}
