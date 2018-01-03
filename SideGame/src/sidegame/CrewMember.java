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
public class CrewMember {
    final static int MaxStavartionDay = 7;
    final static int MildStarvartionDay= 5;
    final static int TrivialStarvartionDay = 3;
    
    private String name;
    private String occupation;
    private  int dayWithoutRation; //
     private int moral; //min 0 max 100        
     private int age;
     private int goldContributionDaily;
     private int goldContributionBefore;
     private int goldContributionAfter;
     private boolean isWomen;
    
    public CrewMember() {
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
    
    
    
}
