package Strings;

public class LengthofWord {
    public static int Length(String s){
        int n = s.length();
        int cnt = 0;
        for(int i = n-1; i >= 0; i--){

            if(s.charAt(i) == ' ' && cnt == 0){
                continue;
            }else if(s.charAt(i) == ' ' && cnt != 0){
                return cnt;
            }else{
                cnt++;
            }
        }
      return cnt;  
    }
    public static void main(String args[]){
        String s = "I am the Best";
        System.out.println(Length(s));
    }
    
}
