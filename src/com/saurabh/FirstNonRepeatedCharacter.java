package com.saurabh;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str="aabbbcccdedd";
        char ch = findFirstNonRepeated(str);
        System.out.println(ch);
    }
    public static char findFirstNonRepeated(String str){
        char ch;
        Map<Character,Integer> hm = new HashMap<Character,Integer>();
        for(char c:str.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(char c: str.toCharArray()){
            if(hm.get(c)==1)
                return c;
        }
        return'\0';
    }
}
