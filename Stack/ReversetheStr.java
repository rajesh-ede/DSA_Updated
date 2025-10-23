package Stack;
import java.util.Stack;
public class ReversetheStr {
    public static String Reverse(String s){
        int n = s.length();
        Stack<Character> st = new Stack();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < n; ++i){
            if(s.charAt(i) != ' '){
                st.push(s.charAt(i));
            }else {
              while(!st.isEmpty()){
                  res.append(st.pop());
              }
                res.append(" ");
            }

        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.toString();
    }
    public static void main(String[] args) {
  String s = "Beast Mode";
       System.out.println( Reverse(s));
    }
}
