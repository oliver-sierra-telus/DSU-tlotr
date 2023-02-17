package com.dsu.tlotr.army;

import com.dsu.tlotr.army.characters.Character;

public class Army {
    private Character[] characters;
    private  ArmyType ARMY_TYPE;

    public void createArmy(int ARMY_SIZE, ArmyType armyType) {
        this.characters = new Character[ARMY_SIZE];
        this.ARMY_TYPE = armyType;
    }

}
