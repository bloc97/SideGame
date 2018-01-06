/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidegame.abilities;

import sidegame.Const;
import sidegame.CrewMember;

/**
 *
 * @author bowen
 */
public class MedicAbility implements Ability {
    
    public static int abilityMedicHealingValue = 20;
    
    @Override
    public String name() {
        return "Medic";
    }
    @Override
    public String description() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void activeAbility(CrewMember crewMember) {
      crewMember.setHealth(crewMember.getHealth() + abilityMedicHealingValue);
      crewMember.setHealthConditionStable(true);
    }

    @Override
    public void passiveAbility(CrewMember crewMember) {
        
    }
    
}
