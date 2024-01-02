package com.saurabh;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordInString {
    public static void main(String[] args) {
        String str= " my name is name my raju";
        String arr[]=str.split(" ");
        HashMap<String,Integer> hmap= new HashMap<String,Integer>();
        for(String s: arr){
            String lower=s.toLowerCase();
            hmap.put(lower,hmap.getOrDefault(lower,0)+1);
        }
        for(Map.Entry<String,Integer> hm: hmap.entrySet()){
            if(hm.getValue()>1){
                System.out.println(hm.getKey());
            }
        }

    }
}
