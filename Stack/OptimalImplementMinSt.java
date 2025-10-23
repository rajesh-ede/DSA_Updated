package Stack;
import java.util.Stack;
public class OptimalImplementMinSt {
    Stack<Integer> st ;
    int min;
    public OptimalImplementMinSt(){
        st = new Stack();
    }
    public void push(int val){
        if(st.isEmpty()){
            st.push(val);                      // Time complexity O(1)
            min = val;                         // Space Complexity O(n)
        }else if(val >= min){
            st.push(val);
        }else{
            st.push(2*val-min);
            min = val;
        }
    }
    void pop(){
        if(st.isEmpty()) return;
        int top = st.pop();
        if(top < min){
            min = 2*min-top;
        }
    }
    int top(){
       int top = st.peek();
       if(top >= min){
           return top;
       }else {
           return  min;
       }
    }
    int getMin(){
     return min;
    }
    public static void main(String[] args) {
        OptimalImplementMinSt ms = new OptimalImplementMinSt();
        ms.push(5); // min=5
        ms.push(3); // min=3 (encoded)
        ms.push(7); // min=3
        ms.push(2); // min=2 (encoded)

        System.out.println(ms.getMin()); // 2
        ms.pop(); // removes 2 -> min=3 restored
        System.out.println(ms.getMin()); // 3
        System.out.println(ms.top());
    }
}
