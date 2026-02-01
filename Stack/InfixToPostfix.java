package Stack;
import java.util.Stack;
public class InfixToPostfix {
    public static int  Prec(char c){
       switch (c){
           case '+':
           case '-':
               return 1;
           case '*' :
           case '/' :
               return 2;
           case '^' :
               return 3;
       }
       return -1;
    }
    public static String Infix(String exp){
        String res ="";
       Stack<Character> st = new Stack<>();
        for(int i = 0; i < exp.length(); ++i){
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                res += c;
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while(!st.isEmpty() && st.peek() != '('){
                    res += st.pop();
                }
                st.pop();
            }else{
                while(!st.isEmpty() && Prec(c) <= Prec(st.peek())){
                    res += st.pop();
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            if(st.peek() == '(')
                return "Invalid Expression";
            res += st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        String exp = "(p+q)*(m-n)";
        System.out.println("InfixExpression " + exp );
        System.out.println("PostfixExpression " + Infix(exp));
    }
}
