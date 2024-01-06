package com.saurabh.numbers;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 371;
        int temp = num, sum = 0;
        boolean flag = true;
        for (; num != 0; num/=10) {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
        }
        if (temp == sum)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Not Armstrong Number");
    }
}
