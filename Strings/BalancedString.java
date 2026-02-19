package Strings;

public class BalancedString { // 1221. Split a String in Balanced Strings

    public static int Balanced(String s){
        int balance = 0, result = 0;
         for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'R'){
                balance++;
            }else{
                balance--;
            }
            if(balance == 0){
                result++;
            }
         }
         return result;
    }
    public static void main(String args[]){
        String s = "RLLLRR";
        System.out.println(Balanced(s));
    }
    
}
