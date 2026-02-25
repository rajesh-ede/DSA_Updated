package Strings;
import java.util.*;
public class MaximumCharacter {
    public static char CharMaxi(String s){
        Map<Character,Integer> ans = new HashMap<>();
        for(char c : s.toCharArray()){
            ans.put(c,ans.getOrDefault(c,0)+ 1);
        }
        int max = 0;
        char maxchar ='\0';
        for(Map.Entry<Character,Integer> entry : ans.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                maxchar = entry.getKey();
            }
        }
        return maxchar;
    }
public static void main(String[] args) {
    String s = "beasst";
    System.out.println(CharMaxi(s));
}
    
}
