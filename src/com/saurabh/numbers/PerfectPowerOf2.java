package com.saurabh.numbers;

public class PerfectPowerOf2 {
    public static void main(String[] args) {
        int num = 1;
        boolean flag = false;
        while (num >1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                flag = true;
                break;
            }
        }
        if(flag==false)
            System.out.println("Number is perfect power of 2");
        else{
            System.out.println("Not perfect power");
        }
    }
}

