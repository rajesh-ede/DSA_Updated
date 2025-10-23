package Stack;
import java.util.Stack;
import java.util.Arrays;
public class OptimalNextGreaterEle {
    public static int[] nextGreater(int[] arr){
        int n = arr.length;
        int []result = new int[n];
        Stack<Integer> st = new Stack();
        for(int i = n-1; i >= 0; i--){                           // Time Complexity O(n)
            while(!st.isEmpty() && st.peek() <= arr[i]){          // Space Complexity O(n)
                st.pop();
            }
            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int []arr = {4, 8, 5, 2, 25};
        System.out.println(Arrays.toString(nextGreater(arr)));
    }
}
