package SlindingWindow;

public class LongestCharReplacement {
    static int Longest(String s,int k){
        int n = s.length();
        int maxLen = 0;
        for(int i = 0; i < n; i++){
            int hash[] = new int [26];                    // Time Complexity O(n^2)
            int CharFreq = 0;                             // Space Complexity O(26)
            for(int j = i; j < n; j++){
                hash[s.charAt(j) - 'A']++;
                CharFreq = Math.max(CharFreq,hash[s.charAt(j) - 'A']);
                int window = j - i + 1;
                int change = window - CharFreq;
                if(change <= k){
                    maxLen = Math.max(maxLen,window);
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 2;
        System.out.println(Longest(s,k));
    }
}

                                   // Question
/* Given an integer k and a string s, any character in the string can be selected and changed to any other uppercase
English character. This operation can be performed up to k times. After completing these steps, return the length of
the longest substring that contains the same letter.

Input : s = "AABABBA" , k = 1
Output : 4
Explanation : The underlined characters are changed in the new string obtained.
The new string is "AABBBBA". The substring "BBBB" is the answer.
There are other ways to achieve this answer.

 */
