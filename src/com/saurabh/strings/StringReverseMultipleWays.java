package com.saurabh.strings;

public class StringReverseMultipleWays {
    public static void main(String[] args) {
        //way 1 using charAt
        String str="my name is hritik";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        //way2 converting to char Array
        char arr[]=str.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        System.out.println();
        //way3 using inbuilt reverse method of StringBuffer
        StringBuffer buff = new StringBuffer(str);
        System.out.println(buff.reverse());
    }

}
