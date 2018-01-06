/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidegame.abilities;

import sidegame.CrewMember;

/**
 *
 * @author bowen
 */
public interface Ability {
    public String name();
    public String description();
    public int id();
    public void activeAbility(CrewMember crewMember);
    public void passiveAbility(CrewMember crewMember);
}
