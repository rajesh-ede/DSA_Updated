package SlindingWindow;

public class OptimalLongestCharReplacement {
    static int SubString(String s,int k){
        int n = s.length();
        int hash[] = new int[26];
        int left = 0, maxlen = 0, maxFreq = 0;
        for(int right = 0; right < n; right++){
            hash[s.charAt(right) - 'A']++;                                // Time Complexity O(n)
            maxFreq = Math.max(maxFreq,hash[s.charAt(right)-'A']);        // Space ComplexityO(26)
            while ((right - left + 1 ) - maxFreq > k){
                hash[s.charAt(left)-'A']--;
                left++;
            }
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 2;
        System.out.println(SubString(s,k));
    }
}
