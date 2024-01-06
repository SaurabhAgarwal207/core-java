package com.saurabh.numbers;

public class Swap2NumberWithout3rdVariable {
    public static void main(String[] args) {
        int a=25,b=17;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = "+a+" b ="+b);
    }
}
