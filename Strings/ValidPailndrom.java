package Strings;

public class ValidPailndrom {
    public static boolean isValid(String s, String t){
        int freq[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int j = 0; j < t.length(); j++){
            freq[t.charAt(j)- 'a']--;
        }
        for(int c : freq){
            if(c != 0){
                return false;
            }
        }
        return true;
    }
 public static void main(String[] args) {
    String s = "rajesh", t = "jhesra";
    if(isValid(s,t)){
     System.out.println("given strings are anagrams");
    }else{
        System.out.println("Invalid Strings not anagrams");
    }
    
 }   
}
