package Strings;

public  class CountVolConFreq {
    public static int maxCount(String s){
         int []freq = new int[26];
         int maxVowel = 0,maxConst = 0;
         for(int i= 0; i < s.length(); i++){
            char c = s.charAt(i);
            int index = c - 'a';
            freq[index]++;
            if("aeiou".indexOf(c) != -1){
             maxVowel = Math.max(maxVowel, freq[index]);
            }else{
                maxConst = Math.max(maxConst, freq[index]);    // Leetcode 3541. Find Most Frequent Vowel and Consonant
            }
         }
         return maxConst + maxVowel;
        
    }
    public static void main (String args[]){
        String s = "rajesh";
        System.out.println(maxCount(s));

    }
}
