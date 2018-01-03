/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidegame;

import java.util.LinkedList;

/**
 *
 * @author panbe
 */
public class Crew {
    LinkedList<CrewMember> crewList = new LinkedList<>();

    public Crew() {
    }
    
    public void checkCrewHunger() {
        
    }
    
    public void postNight() {
        //kill crew if passed max starvation day without food
    }
    
    public void onNight() {
        //thing to run first thing at the night start
            //daily contribution
        for(CrewMember crewMember: crewList) {
            
        }
    }
    
}
