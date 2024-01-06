package com.saurabh.strings;

public class NumberOfWordsInString {
    public static void main(String[] args) {
        String str="my name is anthony gonsalves";
        int count=0;
        String arr[]=str.split(" ");
        for(String s:arr){
         count++;
        }
        System.out.println("Total words in string are "+count);
    }
}
