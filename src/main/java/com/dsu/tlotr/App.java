package com.dsu.tlotr;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TLOTR gameTLOTR = new TLOTR(5);
        gameTLOTR.initArmys();
        gameTLOTR.initFights();
    }
}
