package com.dsu.tlotr.util;

public class Dice {
    
    public static int getRandomNumber(Limit limit){
        return (int)(Math.random()*(limit.getMAX()-limit.getMIN()+1)+limit.getMIN());
    }

    public static int getMaxRandomNumber(Limit limit, int numberDices) {
        int maxResult = limit.getMIN();
        int tempResult =0;
        for (int i = 0; i < numberDices; i++) {
            tempResult = getRandomNumber(limit);
            System.out.println("Dice "+i+" Result: "+tempResult);
            if (tempResult>maxResult){
                maxResult = tempResult;
            }
        }
        return maxResult;
    }
}
