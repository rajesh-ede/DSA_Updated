package Stack;
import java.util.Stack;
import java.util.Vector;

public class ValidParenthesis {
    static boolean isValid(String s){
       Stack<Character> st = new Stack<>();           // Time Complexity O(n)
       for(char c : s.toCharArray()){                 // Space Complexity O(n)
           if(c == '(' || c == '{' || c == '['){
               st.push(c);
           }else if(c == ')' || c == '}' || c == ']'){
               if(st.isEmpty()) return false;
               char top = st.peek();
               if((c == ')' && top != '(')||
                       (c == '}' && top != '{')||
                       (c == ']' && top != '[')){
                   return false;
               }
               st.pop();
           }
       }

       return st.isEmpty();
    }
    public static void main(String[] args) {
      String textcase[] = {"[{()}]","{()}","(){}","{}([)]"};
      for(String s: textcase){
          System.out.println("Input" +  s + "->" + ((isValid(s)) ? "true" : "false"));
      }
    }
}
/*
Given a string s, composed of different combinations of '(' , ')', '{', '}', '[', ']', verify the validity of the arrangement.
An input string is valid if:

         1. Open brackets must be closed by the same type of brackets.
         2. Open brackets must be closed in the correct order.
 */