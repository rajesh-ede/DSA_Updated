package Strings;

import java.util.*;

public class WordsContainsCharacter {
    public static List<Integer> Count (String[] words, char x){
        List<Integer> res = new ArrayList<>();
      
        for(int i = 0; i < words.length; i++){
            for( char c : words[i].toCharArray()){
                if(c == x){
                  res.add(i);
                  break;
                }
            }
        }
        return res;
    }

    public static void main (String[] args){
        String[] words = {"leet", "code"};
        char x = 'e';
        List<Integer> ans = Count(words,x);
        System.out.println(ans);
    }
}
