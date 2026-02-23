package Strings;

public class ReverseWithoutBuiltin {
    public static String reverse(String s){
        String rev = "";
        for(int i = s.length()-1; i >= 0; i--){       //Time Complexity O(
            rev +=s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String s = "Rajesh";
       System.out.println("Reversed String is :" + reverse(s));
    }
}
