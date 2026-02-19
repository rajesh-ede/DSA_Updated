package SlindingWindow;

public class MinWindowBrute {
    public static String minWindowBrute(String s, String t) {
        int n = s.length();
        String ans = "";
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {                         //Time Complexity O(n^2)
            for (int j = i; j < n; j++) {                     // Space Complexity O(128)
                String sub = s.substring(i, j + 1);
                if (containsAll(sub, t) && sub.length() < minLen) {
                    ans = sub;
                    minLen = sub.length();
                }
            }
        }
        return ans;
    }
    private static boolean containsAll(String sub, String t) {
        int[] freq = new int[128];
        for (char c : sub.toCharArray()) freq[c]++;
        for (char c : t.toCharArray()) {
            if (--freq[c] < 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
       String s = "ADOBECODEBANC";
       String t = "ABC";
       System.out.println(minWindowBrute(s,t));
    }
}
/* Given two strings s and t. Find the smallest window substring of s that includes all characters in
 t (including duplicates) , in the window. Return the empty string "" if no such substring exists.

Input : s = "ADOBECODEBANC" , t = "ABC"
Output : "BANC"
Explanation : The minimum window substring of string s that contains the string t is "BANC".

 */