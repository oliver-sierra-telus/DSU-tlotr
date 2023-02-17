package com.dsu.tlotr.army.characters;

import com.dsu.tlotr.util.Dice;

public class Character {
    private final CharacterType CHARACTER_TYPE;
    private int shield; 
    private int lifePoints;
    private Fighter fighter;
    

    public Character(CharacterType CHARACTER_TYPE, Fighter fighter) {
        this.CHARACTER_TYPE = CHARACTER_TYPE;
        this.lifePoints = CHARACTER_TYPE.getMaxLifePoints();
        this.shield = CHARACTER_TYPE.getShieldAmount();
        this.fighter = fighter;
    }

    public CharacterType getCharacterType() {
        return CHARACTER_TYPE;
    }

    public String getType(){
        return CHARACTER_TYPE.name();
    }

    public String getNameAndType(){
        return this.getName()+" (" + this.getType() + ") ";
    }

    public boolean isAlive() {
        return (lifePoints>0);
    }

    public String getName() {
        return fighter.getName();
    }

    public int getAmountOfDamage(Character defender, int numberDices) {
        int totalAttack = Dice.getMaxRandomNumber(CHARACTER_TYPE.getAttackLimit(),numberDices);
        return totalAttack + fighter.hateTo(defender.getCharacterType());
    }

    public int getLifePoints() {
        if (lifePoints>0){
            return lifePoints;
        }
        return 0;
    }

    public int defend(Character attacker, int amountOfDamage) {
        int damage = amountOfDamage - getAmountOfShield(attacker);
        if (damage > 0){
            lifePoints-=damage;
            return damage;
        }
        return 0;
    }

    public int getAmountOfShield(Character attacker) {
        return this.shield + fighter.fearOf(attacker.getCharacterType());
    }

    public String showAllInfo() {
        return this.getNameAndType() + " LifePoints: "+this.getLifePoints();
    }
    
    
}
