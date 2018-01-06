/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidegame;

/**
 *
 * @author panbe
 */
public class CrewMemberAbility {
    private String name;
    private String description;
    private String tag;
    private int dayTillReady;
    

    
    public CrewMemberAbility() {
    }
    
    public void targetAbility(CrewMember crewMember) {
        if (tag.equals("Medic")) {
            abilityMedic(crewMember);
        }
    }
    
    public void passiveAbility() {
        //for ability that is excuted at a interval
    }
    
    public void abilityMedic(CrewMember crewMemberTarget) {
      crewMemberTarget.setHealth( crewMemberTarget.getHealth()+Const.abilityMedicHealingValue);
      crewMemberTarget.setHealthConditionStable(true);
    }
    
    public void abilityCookRandom() {
        
    }
    
    public void abilityHunt() {
        
    }
    
    public void abilityGather() {
        
    }
    
    public void abilityMakeDrug() {
        
    }
    
}
