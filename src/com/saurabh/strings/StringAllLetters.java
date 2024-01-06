package com.saurabh.strings;

public class StringAllLetters {
    public static void main(String[] args) {
        String str="shrinay";
        boolean flag=false;
        char arr[]=str.toCharArray();
        for(char c:arr){
            if(!Character.isLetter(c)){
                flag=true;
                break;
            }
        }
        if(flag==true)
            System.out.println("String contains other things as well");
        else
            System.out.println("String contains letter only");
    }
}
