package com.dsu.tlotr.util;

public class Dice {
    
    public static int getRandomNumber(Limit limit){
        return (int)(Math.random()*(limit.getMAX()-limit.getMIN()+1)+limit.getMIN());
    }
}
