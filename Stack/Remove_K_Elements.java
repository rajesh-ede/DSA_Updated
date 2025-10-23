package Stack;
import java.util.Stack;
import java.lang.StringBuilder;

public class Remove_K_Elements {
    public static String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();                       // leet Code
        for(char ch : num.toCharArray()){
            while(!st.isEmpty() && k > 0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(!st.isEmpty() && k > 0){
            st.pop();
            k--;
        }
        StringBuilder sc = new StringBuilder();
        while(!st.isEmpty()){
            sc.append(st.pop());
        }
        sc.reverse();

        while(sc.length() > 0 && sc.charAt(0) == '0'){
            sc.deleteCharAt(0);
        }
        return sc.length() > 0 ? sc.toString() : "0";
    }

    public static void main(String[] args) {
        String a = "1432219";
        int k = 3;
        System.out.println(removeKdigits(a,k));
    }
}
