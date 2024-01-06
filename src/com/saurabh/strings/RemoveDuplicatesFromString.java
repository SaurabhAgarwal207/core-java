package com.saurabh.strings;


import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str= "my name is my saurabh";
        String arr[]=str.split(" ");
        LinkedHashSet<String> hs =new LinkedHashSet<>();
        for(String s: arr){
            hs.add(s);
        }
       // String arr2[]= hs.stream().toArray(String[] :: new);
        for(String p: hs)
            System.out.print(p+" ");
    }
}
