package com.aledepetris.roadmap.algomaster.bit.manipulation;

public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int cant = 0;
        while (n != 0) {
            cant = cant + (n & 1);
            n = n >>> 1;
        }
        return cant;
    }

}
