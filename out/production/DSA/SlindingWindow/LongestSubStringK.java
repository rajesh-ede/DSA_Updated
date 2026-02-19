package SlindingWindow;
import java.util.*;

public class LongestSubStringK {
    static int Longest(String s, int k){
        int maxLen = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                char ch = s.charAt(j);                                  // Time Complexity O(n^2)
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.size() <= k){
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;

    }
    public static void main(String[] args) {
        String s = "aababbcaacc";
        int k = 2;
        System.out.println(Longest(s,k));
    }
}
                 // QUESTION
/* Given a string s and an integer k.Find the length of the longest substring with at most k distinct characters.

Input : s = "aababbcaacc" , k = 2
Output : 6
Explanation : The longest substring with at most two distinct characters is "aababb".
The length of the string 6.
 */