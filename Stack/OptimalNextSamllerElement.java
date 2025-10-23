package Stack;
import java.util.Arrays;
import java.util.Stack;
public class OptimalNextSamllerElement {
    public static int[] nextSmaller(int []arr){
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();             // Time Complexity O(n)
        for(int i = n-1; i >= 0; i--){                 // Space Complexity O(n)
           while(!st.isEmpty() && arr[i] <= st.peek()){
               st.pop();
           }
           ans[i] = st.isEmpty() ? -1 : st.peek();
           st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int ans[] = {4, 8, 5, 2, 25};
        System.out.println(Arrays.toString(nextSmaller(ans)));
    }
}
/*
Given an array of integers arr, your task is to find the Next Smaller Element (NSE) for every element in the array.
The Next Smaller Element for an element x is defined as the first element to the right of x that is smaller than x.
If there is no smaller element to the right, then the NSE is -1.

Input: arr = [10, 9, 8, 7]
Output: [9, 8, 7, -1]
Explanation:
Each element’s next right neighbor is smaller.
 */