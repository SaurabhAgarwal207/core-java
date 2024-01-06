package com.saurabh.numbers;

public class GCDof2Numbers {
    public static void main(String[] args) {
        int num1=6,num2=45;
        while(num1!=num2){
            if(num1>num2){
                num1=num1-num2;
            }
            else{
                num2=num2-num1;
            }
        }
        System.out.println(num1);

    }
}
