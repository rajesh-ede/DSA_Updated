package SlindingWindow;

public class NumberOfSubStringCon {
    static int SubString(String s){
        int n = s.length();
        int count = 0;
        for(int i = 0; i < n; i++){
            int[] hash = new int[3];
            for(int j = i; j < n; j++){
                char ch = s.charAt(j);
                if(ch == 'a')
                    hash[0]++;                            // Time Complexity O(n^2)
                else if(ch == 'b')                        // Space Complexity O(n)
                    hash[1]++;
                else if(ch == 'c')
                    hash[2]++;
                if(hash[0]>0 && hash[1] > 0 && hash[2] > 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
       String s = "bbacba";
       System.out.println(SubString(s));
    }
}
/*
Given a string s , consisting only of characters 'a' , 'b' , 'c'.Find the number of substrings that contain at least one
occurrence of all these characters 'a' , 'b' , 'c'.

Input : s = "abcba"
Output : 5
Explanation : The substrings containing at least one occurrence of the characters 'a' , 'b' , 'c' are "abc" , "abcb" ,
 "abcba" , "bcba" , "cba".
 */