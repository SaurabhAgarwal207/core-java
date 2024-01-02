package com.saurabh;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfCharacter {
    public static void main(String[] args) {
        String str="saurabh";
        HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
        char arr[]=str.toCharArray();
        for(char ch: arr){
            hmap.put(ch, hmap.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : hmap.entrySet()){
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
    }

}
