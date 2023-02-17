
package com.dsu.tlotr;

import com.dsu.tlotr.army.Army;
import com.dsu.tlotr.army.characters.Character;

public class Turn {

    private Army[] armies;

    public Turn(Army army, Army army2) {
        armies = new Army[2];
        armies[0] = army;
        armies[1] = army2;
    }

    public void executeFights() {
        Character fighter1;
        Character fighter2;

        presentArmies("Starting the fight");
        while (armies[0].areAnyFighterAlive() && armies[1].areAnyFighterAlive()) {
            fighter1 = armies[0].getNextFighter();
            fighter2 = armies[1].getNextFighter();
            oneFight(fighter1,armies[0].getNumberDices(), fighter2);
            if (fighter2.isAlive()){
                oneFight(fighter2,armies[1].getNumberDices(), fighter1);
            }
        }
        presentArmies("Ending the fight");
    }

    public void presentArmies(String message){
        System.out.println("              "+message);
        armies[0].presentFighters();
        armies[1].presentFighters();
    }

    public void oneFight(Character attacker, int attackerNumberDices , Character defender){
        System.out.println("\n");
        System.out.println(attacker.getNameAndType()+" vrs "+defender.getNameAndType());
        int amountOfDamage = attacker.getAmountOfDamage(defender,attackerNumberDices);
        int lifePointsBeforeAttack = defender.getLifePoints();
        int damageOfTheAttack = defender.defend(attacker, amountOfDamage);
        System.out.println("          Attacker: "+attacker.getName() + " hit "+ amountOfDamage + " Damage of the attack "+damageOfTheAttack);
        System.out.println("          Defender: "+defender.getName() + " LP Before: "+lifePointsBeforeAttack + " Shield: " + defender.getAmountOfShield(attacker) + " LP: "+defender.getLifePoints());
        System.out.println("\n");
    }

}
