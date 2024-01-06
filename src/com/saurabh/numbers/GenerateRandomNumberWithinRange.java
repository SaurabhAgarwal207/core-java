package com.saurabh.numbers;

import java.util.Random;

public class GenerateRandomNumberWithinRange {
    public static void main(String[] args) {
        Random ram = new Random();
        int maxRange=2500;
        //generate 5 numbers
        for(int i=0;i<5;i++)
            System.out.println(ram.nextInt(maxRange));
    }
}
