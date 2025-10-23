package SlindingWindow;
//Given a string, S. Find the length of the longest substring without repeating characters.

// Input : S = "abcddabac"
//Output : 4
//Explanation : The answer is "abcd" , with a length of 4.

public class LongestSubString {
    public static int Unique(String s){
        int n = s.length();
        int res = 0;

        for(int i = 0; i < n; i++){
            boolean vis[] = new boolean[26];
            for(int j = i; j < n; j++){
                if(vis [s.charAt(j) - 'a'] == true)            //Time Complexity O(n^2)
                    break;                                     // Space Complexity O(1)

                else{
                    res = Math.max(res,j - i + 1);
                    vis[s.charAt(j) - 'a'] = true;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(Unique(s));
    }
}
