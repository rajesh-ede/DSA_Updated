package Stack;
import java.util.Stack;
public class ImplementMinSt {
    Stack<Integer> st ;
    Stack<Integer> min;
    public ImplementMinSt(){
        st = new Stack<>();
        min = new Stack<>();
    }
    public void push(int val){
        st.push(val);                                      // Time Complexity O(1)
        if(min.isEmpty() || val <= min.peek()){            // Space Complexity O(n) + O(n)
            min.push(val);
        }
    }
    void pop(){
        if(st.isEmpty()) return;
        int remove = st.pop();
        if(!min.isEmpty() && remove == min.peek()){
            min.pop();
        }
    }
    int top(){
        return st.peek();
    }
    int getMin(){
        return min.peek();
    }
    public static void main(String[] args) {
        ImplementMinSt stack = new ImplementMinSt();
        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(1);

        System.out.println(stack.getMin()); // 1
        stack.pop(); // removes 1
        System.out.println(stack.getMin()); // 2
        System.out.println(stack.top());
    }
}
