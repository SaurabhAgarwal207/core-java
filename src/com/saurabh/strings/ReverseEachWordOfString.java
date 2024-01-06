package com.saurabh.strings;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
    String str="my name is kshitij";
    String arr[]=str.split(" ");
    String rev="";
    for(String s:arr){
        rev=rev+reverseString(s)+" ";
    }
        System.out.println(rev);
    }
    public static String reverseString(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev;
    }
}
