/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidegame;

import java.util.LinkedList;
import java.util.List;
import sidegame.abilities.Ability;

/**
 *
 * @author panbe
 */
public class CrewMember extends CarriageCargo {
    final static int MaxStavartionDay = 7;
    final static int MildStarvartionDay= 5;
    final static int TrivialStarvartionDay = 3;
    
    final static int extremeHealthIndice = 10;
    final static int majorHealthIndice = 30;
    final static int mildHealthIndice = 50;
    final static int trivialHealthIndice = 80;
    final static int maxHealth = 100;
    
    private final List<Ability> abilities = new LinkedList<>();
    
    private String name;
    private String occupation;
    private  int dayWithoutRation; //
     private int moral; //min 0 max 100        
     private int health; //0-100 //recovery with rest or doctor care
     private int age;
     private int goldContributionDaily;
     private int goldContributionBefore;
     private int goldContributionAfter;
     private int goodCompanionIndice; //passively improve or diminush moral
     private boolean isWomen;
     private boolean healthConditionStable;
    
    public CrewMember(int id, String name) {
        super(id, name, 1);
    }
    
    public void checkHunger() {
        if (dayWithoutRation >=MaxStavartionDay) {
            System.out.println(name+" will not survive the night without food");
        }
       else if (dayWithoutRation >= MildStarvartionDay) {
            System.out.println(name+" doesnt look well and could really eat something");
        }
       else if (dayWithoutRation >= TrivialStarvartionDay) {
            System.out.println(name+" would be happy with some food today");
        }
       else {
            System.out.println(name+" just ate");
       }
    }
    public void checkHealth() { ///to be finished
         if (health <=extremeHealthIndice) {
            System.out.println(name+" ");
        }
       else if (health <= majorHealthIndice) {
            System.out.println(name+" doesnt look well and could really eat something");
        }
       else if (health <= mildHealthIndice) {
            System.out.println(name+" would be happy with some food today");
        }
       else if (health <= trivialHealthIndice) {
            System.out.println(name+" just ate");
       }
       else {
           
       }
    }
    public void checkHealthIsStable() {
        if (healthConditionStable && health == maxHealth) {
            System.out.println("Appair to be in perfect health condition");
        }
        else if (healthConditionStable && health != maxHealth) {
            System.out.println(" Appair to be injured, but is recovering");
        }
        else if (!healthConditionStable) {
            System.out.println(" is injured and condition degrating");
        }
    }
    
    public int applyDailyContrib() {
        return goldContributionDaily;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getDayWithoutRation() {
        return dayWithoutRation;
    }

    public int getMoral() {
        return moral;
    }

    public int getAge() {
        return age;
    }

    public int getGoldContributionDaily() {
        return goldContributionDaily;
    }

    public int getGoldContributionBefore() {
        return goldContributionBefore;
    }

    public int getGoldContributionAfter() {
        return goldContributionAfter;
    }

    public boolean isIsWomen() {
        return isWomen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setDayWithoutRation(int dayWithoutRation) {
        this.dayWithoutRation = dayWithoutRation;
    }

    public void setMoral(int moral) {
        this.moral = moral;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGoldContributionDaily(int goldContributionDaily) {
        this.goldContributionDaily = goldContributionDaily;
    }

    public void setGoldContributionBefore(int goldContributionBefore) {
        this.goldContributionBefore = goldContributionBefore;
    }

    public void setGoldContributionAfter(int goldContributionAfter) {
        this.goldContributionAfter = goldContributionAfter;
    }

    public void setIsWomen(boolean isWomen) {
        this.isWomen = isWomen;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getGoodCompanionIndice() {
        return goodCompanionIndice;
    }

    public void setGoodCompanionIndice(int goodCompanionIndice) {
        this.goodCompanionIndice = goodCompanionIndice;
    }

    public boolean isHealthConditionStable() {
        return healthConditionStable;
    }

    public void setHealthConditionStable(boolean healthConditionStable) {
        this.healthConditionStable = healthConditionStable;
    }
    
    public boolean addAbility(Ability ability) {
        if (!abilities.contains(ability)) {
            abilities.add(ability);
            return true;
        }
        return false;
    }
    
}
