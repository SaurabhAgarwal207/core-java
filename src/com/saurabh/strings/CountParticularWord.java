package com.saurabh.strings;

public class CountParticularWord {
    public static void main(String[] args) {
        String str="my name is my my find it";
        String toFind="my";
        String arr[]=str.split(" ");
        int count=0;
        for(String s:arr){
            if(s.equals(toFind))
                count++;
        }
        System.out.println("Total occurrences of word "+toFind+" is : "+count);
    }
}
