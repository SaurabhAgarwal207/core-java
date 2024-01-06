package com.saurabh.numbers;

public class SumOFDigits {
    public static void main(String[] args) {
        int num=713054;
        int sum=0;
        while(num!=0){
            int temp=num%10;
            sum=sum+temp;
            num=num/10;
        }
        System.out.println("Sum is : "+sum);
    }
}
