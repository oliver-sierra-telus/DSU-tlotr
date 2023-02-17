package com.dsu.tlotr.army.characters;

import com.dsu.tlotr.util.Limit;

public enum CharacterType {
    ORC(60,130, new Limit(70,130)),
    GOBLIN(70,120, new Limit(70,140)),
    ELVE(90,120, new Limit(50,120)),
    HUMAN(85,110, new Limit(50,110)),
    HOBBIT(70,100, new Limit(50,80)),
    CREATURE(75,100, new Limit(50,100))
    ;

    private final int SHIELD;
    private final int LIFE_POINTS;
    private final Limit ATTACK_LIMIT;
    
    CharacterType(int shield, int lifePoints, Limit attackLimit){
        this.SHIELD = shield;
        this.LIFE_POINTS = lifePoints;
        this.ATTACK_LIMIT = attackLimit;
    }

    public int getShieldAmount(){
        return SHIELD;
    }

    public int getMaxLifePoints(){
        return LIFE_POINTS;
    }

    public Limit getAttackLimit(){
        return ATTACK_LIMIT;
    }
    
}
