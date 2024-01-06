package com.saurabh.strings;

public class OccurenceOfSubstringInString {
    public static void main(String[] args) {
        String str="my name is my jojo my uncle";
        String sub="my";
        int count=0,index=0;
        while(index!=-1) {
            index = str.indexOf(sub, index);
            if(index!=-1) {
                count++;
                index += sub.length();
            }
        }
        System.out.println("Occurence of "+sub+" is :"+count);

    }
}
