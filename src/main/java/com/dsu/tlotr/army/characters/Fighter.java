package com.dsu.tlotr.army.characters;

public interface Fighter {

    public abstract int fearOf(CharacterType characterType);

    public abstract int hateTo(CharacterType characterType);

    public abstract String getName();
    
}
