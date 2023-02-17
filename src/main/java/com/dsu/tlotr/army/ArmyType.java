package com.dsu.tlotr.army;

import com.dsu.tlotr.army.characters.CharacterType;
import com.dsu.tlotr.util.Dice;
import com.dsu.tlotr.util.Limit;
import static com.dsu.tlotr.army.characters.CharacterType.*;

public enum ArmyType {
    HEROES(2,  new CharacterType[] { HUMAN, ELVE, HOBBIT, CREATURE }),
    BEASTS(1, new CharacterType[] { ORC, GOBLIN, CREATURE });

    private final int NUMBER_DICES;
    
    private final CharacterType[] CHARACTERS_TYPES;

    ArmyType(int numberDices,  CharacterType[] characterTypes) {
        this.NUMBER_DICES = numberDices;
        this.CHARACTERS_TYPES = characterTypes;
    }

    public int getNumberDices() {
        return NUMBER_DICES;
    }    

    public CharacterType getCharacterTypeRandom() {
        return CHARACTERS_TYPES[Dice.getRandomNumber(new Limit(0, CHARACTERS_TYPES.length - 1))];
    }

    public CharacterType[] getPossibleCharacterTypes(){
        return CHARACTERS_TYPES;
    }
}
