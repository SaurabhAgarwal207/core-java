package com.saurabh.basics;

public class SumOFDigits1toN {
    public static void main(String[] args) {
        int num = 20;
        int count=1;
        //int sum = 0;
        for(count=1;count<=num;count++){
            int t=count;
            int sum = 0;
            int temp=0;
            while (t != 0) {
                temp = t % 10;
                sum = sum + temp;
                t = t / 10;
            }
            System.out.println("Sum is : " + sum);
        }
    }
}
