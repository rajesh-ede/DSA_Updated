package Stack;
import java.util.Arrays;
import java.util.Stack;
public class OptimalNeatGreaterElemenetII {
    public static int[] Greater(int[] arr){
        int n = arr.length;                          // TimeComplexity O(n)
        int res[] = new int[n];                       // space complexity O(n)
        Stack<Integer> st = new Stack();
        for(int i = n-1; i >= 0; i--){
            st.push(arr[i]);
        }
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
         return res;
    }
    public static void main(String[] args) {
      int arr[] = {1,2,1};
      System.out.println(Arrays.toString(Greater(arr)));
    }
}
