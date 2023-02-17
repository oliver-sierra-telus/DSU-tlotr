package com.dsu.tlotr.creatures;

import com.dsu.tlotr.army.characters.CharacterType;
import com.dsu.tlotr.army.characters.Fighter;

public class Dog implements Fighter {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public int fearOf(CharacterType characterType) {
        if (characterType != CharacterType.HUMAN){
            return 0;
        }
        return -10;
    }

    public int hateTo(CharacterType characterType) {
        if (characterType == CharacterType.ORC){
            return 10;
        }
        return 0;
    }

    public String getName() {
        
        return this.name;
    }
    
}
