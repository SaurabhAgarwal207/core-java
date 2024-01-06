package com.saurabh.numbers;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=19;
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                flag=false;
                break;
            }
        }
        if(flag==true)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
