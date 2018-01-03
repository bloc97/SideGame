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
public class Caravan {
    private final Player player;
    private final List<Carriage> carriages;
    private final List<CrewMember> militaryMembers;

    public Caravan(Player player) {
        this.player = player;
        this.carriages = new LinkedList<>();
        this.militaryMembers = new LinkedList<>();
    }
    
    public Player getPlayer() {
        return player;
    }

    public List<Carriage> getCarriages() {
        return carriages;
    }

    public List<CrewMember> getMilitaryMembers() {
        return militaryMembers;
    }
    
    
    
}
