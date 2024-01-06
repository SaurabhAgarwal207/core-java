package com.saurabh.numbers;
/*
%3 and %5 FizzBuzz
%3 Fizz
%5 Buzz
sum>3*n break
 */
public class FizzBuzz {
    public static void main(String[] args) {
        int n=20;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0)
                System.out.println("fizz");
            else if (i%5==0)
                System.out.println("Buzz");
                else{
                System.out.println(i);
                    sum=sum+i;
                    if(sum>3*n) {
                        System.out.println("sum is :"+sum);
                        break;
                    }
            }
        }
    }
}
