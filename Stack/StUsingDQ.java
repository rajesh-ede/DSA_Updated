package Stack;

import java.util.ArrayDeque;

public class StUsingDQ {
    public static void main(String[] args) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.pop() +"has been removed");
        System.out.println(st.peek());
    }
}
