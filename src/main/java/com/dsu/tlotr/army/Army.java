package com.dsu.tlotr.army;

import com.dsu.tlotr.army.characters.Character;
import com.dsu.tlotr.creatures.Dog;

public class Army {
    private Character[] characters;
    private ArmyType ARMY_TYPE;
    private int armyPosition;

    public void createArmy(int ARMY_SIZE, ArmyType armyType) {
        this.characters = new Character[ARMY_SIZE];
        this.ARMY_TYPE = armyType;
        for (int i = 0; i < ARMY_SIZE; i++) {
            characters[i] = new Character(ARMY_TYPE.getCharacterTypeRandom(), new Dog("perrin "+i));
        }

        
        this.armyPosition = 0;
        // por completar
    }

    public void createArmy(Character[] characters, ArmyType armyType) {
        this.characters = characters;
        this.ARMY_TYPE = armyType;
        this.armyPosition = 0;
    }

    public Character getNextFighter() {

        if (characters[armyPosition].isAlive()) {
            Character tempCharacter = characters[armyPosition];
            setNextArmyPosition();
            return tempCharacter;
        }

        boolean figtherAlive = areAnyFighterAlive();
        while (figtherAlive) {
            setNextArmyPosition();
            if (characters[armyPosition].isAlive()) {
                Character tempCharacter = characters[armyPosition];
                setNextArmyPosition();
                return tempCharacter;
            }
            
        }
        // throw exception
        return null;
    }

    public int getNumberDices() {
        return ARMY_TYPE.getNumberDices();
    }

    public ArmyType getArmyType() {
        return ARMY_TYPE;
    }

    private void setNextArmyPosition() {
        armyPosition++;
        if (armyPosition >= characters.length) {
            armyPosition = 0;
        }
    }

    public boolean areAnyFighterAlive() {
        for (Character character : characters) {
            if (character.isAlive()) {
                return true;
            }
        }
        return false;
    }

    public void presentFighters() {
        System.out.println("  ARMY OF " + this.ARMY_TYPE.name() + "\n");
        for (Character character : characters) {
            System.out.println(character.showAllInfo());
        }
    }

}
