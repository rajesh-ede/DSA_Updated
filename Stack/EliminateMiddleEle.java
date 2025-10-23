package Stack;
import java.util.Stack;
public class EliminateMiddleEle {
    public static void Middle(Stack<Integer> st){
        int n = st.size();                                       // Time Complexity O(n)
        int count = 0;                                           // Space Complexity O(n)
        Stack<Integer> temp = new Stack<>();
        while(count < n/2){
            int c = st.pop();
            temp.push(c);
            count++;
        }
        st.pop();
        while(!temp.isEmpty() ){
            st.push(temp.pop());
        }

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(15);
        st.push(17);
        st.push(20);
        st.push(25);

        Middle(st);
        while(!st.isEmpty()){
            int p = st.pop();
            System.out.println(p+" ");
        }
    }
}
