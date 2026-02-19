package Strings;

public class ReversewithBuiltin {
    static String reverse(String s){
        StringBuilder res = new StringBuilder(s);     //Time Complexity O(n)
        res.reverse();                                // Space Complexity O(1)
      return   res.toString();
    }
    public static void main(String[] args) {
        String s = "rajesh";
        System.out.println(reverse(s));
    }
}
