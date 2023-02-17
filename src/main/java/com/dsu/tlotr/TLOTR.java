package com.dsu.tlotr;

import com.dsu.tlotr.army.Army;
import com.dsu.tlotr.army.ArmyType;

public class TLOTR {
    private Turn turn; 
    private Army[] army;
    private final int ARMY_SIZE;

    public TLOTR(int armySize){
        this.ARMY_SIZE = armySize;
    }

    public void initArmys(){
        army = new Army[2];
        army[0] = new Army();
        army[1] = new Army();
        army[0].createArmy(ARMY_SIZE, ArmyType.HEROES);
        army[1].createArmy(ARMY_SIZE, ArmyType.BEASTS);
        turn = new Turn(army[0], army[1]);
    }

    public void initFights(){
        turn.executeFights();
    }

    public void printResults(){
        System.out.println("Final Result:");
        army[0].toString();
        army[1].toString();
    }

}
