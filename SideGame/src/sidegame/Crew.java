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
    
    public void onNight(Player player) {
        //thing to run first thing at the night start
            //daily contribution
        for(CrewMember crewMember: crewList) {
            // only one for should be used for maximal performance, 
                //dailyGroupeReport() should be here
                dailyReport(player, crewMember);
        }
    }
    
    public void preNight() {
        //the result of the task ask to be done during the day should be compute here
        
    }
    
    public void dailyReport(Player player, CrewMember crewMember) { //TAKE ONE CREWMEMBER IS TO BE USED IN A FOR LOOP
        //call fonction for daily contribution
        dailyContribution(player, crewMember);
        //call fonction for moral influence
    }
    
    public void dailyContribution(Player player,CrewMember crewMember) {
      player.setGold(player.getGold() +  crewMember.getGoldContributionDaily()); 
    }
    
}
