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
public interface CaravanCargo {
    public int getCargoId();
    @Deprecated
    public String getCargoName();
    
    public int getQuantity();
    public void setQuantity(int amount);
    
    public CaravanCargo getCopy();
    
}
