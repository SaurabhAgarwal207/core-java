package com.saurabh;

import java.util.HashMap;
import java.util.Map;

public class OccurrencesAllWords {
    public static void main(String[] args) {
        String str="my name is my friend";
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        String arr[]=str.split(" ");
        for(String s: arr){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer> map : hm.entrySet()){
            System.out.println(map.getKey()+" -> "+map.getValue());
        }
    }
}
