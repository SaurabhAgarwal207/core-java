package com.saurabh.strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterString {
    public static void main(String[] args) {
        String str="abnnddcce";

        HashMap<Character,Integer> strMap = new HashMap<Character,Integer>();
        for(char ch:str.toCharArray()){
            strMap.put(ch,strMap.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : strMap.entrySet()){
            if(entry.getValue()>1)
                System.out.println(entry.getKey());
        }
    }
}
