package com.dsu.tlotr.army.characters;

public class Character {
    private final CharacterType CHARACTER_TYPE;

    public Character(CharacterType CHARACTER_TYPE) {
        this.CHARACTER_TYPE = CHARACTER_TYPE;
    }

    public CharacterType getCharacterType() {
        return CHARACTER_TYPE;
    }
    
    
}
