package com.saurabh.strings;

public class StringSwapWithoutThirdVariable {
    public static void main(String[] args) {
        String str1 = "my name";
        String str2 = "saurabh agarwal";
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1= str1.substring(str2.length());

        System.out.println("str1 : "+str1);
        System.out.println("str2 : "+str2);

    }
}
