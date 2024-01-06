package com.saurabh.numbers;

public class SmallestOf3Numbers {
    public static void main(String[] args) {
        int a=5,b=7,c=1;
        System.out.println(a<b?(a<c?a:c):(b<c?b:c));
    }
}
