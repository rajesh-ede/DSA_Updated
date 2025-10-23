package Stack;
import java.util.Stack;
public class ReverseUsingSt {
    public static String isValid(String S){
        Stack<Character> st  = new Stack<>();    // Timpe Complexity O(n)
        for(char c : S.toCharArray()){           // Space Complexity O(n)
            st.push(c);
        }
        StringBuilder sc = new StringBuilder();
        while(!st.isEmpty()) {
            sc.append(st.pop());
        }
        return sc.toString();
    }
    public static void main(String[] args) {
        String s = "Rajesh";
        ;
        System.out.println(isValid(s));
    }
}

/*
You are given a string s , the task is to reverse the string using stack.
 */
