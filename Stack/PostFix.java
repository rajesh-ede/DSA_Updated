package Stack;
import java.util.Stack;
public class PostFix {
    public static boolean isValid(char x){
        switch(x){
            case '+':
            case  '-':
            case '*' :
            case '/':
                return true;
        }
        return false;
    }
    public static String Post(String s){
        int n = s.length();
        Stack<String> st = new Stack<>();
        for(int i = 0; i < n; i++){         //   Time Complexity O(n)
            if(isValid(s.charAt(i))){          // Space COmplexityO(n)
                String op1 = st.peek();
                st.pop();
                String op2 = st.peek();
                st.pop();

                String temp = s.charAt(i) + op2+op1;
                st.push(temp);
            }else{
                st.push(s.charAt(i) + "");
            }
        }
        String ans = "";
        for(String i : st)
            ans += i;
        return ans;
    }
    public static void main(String[] args) {
       String ans = "ABC/-AK/L-*";
       System.out.println(Post(ans));
    }
}
/*
You are given a string that represents the postfix form of a valid mathematical expression.
Convert it to its prefix form.
 */
