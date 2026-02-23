package SlindingWindow;

import java.util.*;

public class OptimalLongestSubStringK {
    static int Sub(String s,int k){
        int n = s.length();
        int left = 0, maxLen = 0;                                // Time Complexity O(n)
        Map<Character,Integer> map = new HashMap<>();             // Space Complexity O(1)
        for(int right = 0; right < n; right++){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while (map.size() > k){
               char leftChar = s.charAt(left);
               map.put(leftChar,map.get(leftChar)-1);
               if(map.get(leftChar) == 0){
                   map.remove(leftChar);

               }

                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "aababbcaacc";
        int k = 2;
        System.out.println(Sub(s,k));
    }
}
