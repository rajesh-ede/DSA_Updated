package Stack;
import java.util.Stack;                         // LeetCode 907
public class OptimalSumofSubarrayMinimum {
    public static int SumOfSub(int []arr){
        int n = arr.length;                           // Time Complexity O(n)
        long min_sum = 0;                             // Space Complexity O(1)
        int Mod = 1000000007;
        int total = 0;
      Stack<Integer> st =new Stack<>();
      for(int i = 0; i <= n; i++){
          while(!st.isEmpty() && (i == n || arr[st.peek()] >= arr[i])){
              int mid = st.pop();
              int left = st.isEmpty() ? -1:st.peek();
              int right = i;

              total = (mid-left) * (right - mid) % Mod;
              min_sum +=(total * arr[mid])%Mod;

              min_sum %= Mod;

          }
          st.push(i);
      }
      return (int) min_sum;
    }
    public static void main(String[] args) {
       int []sum = {3,1,2,4};
       System.out.println(SumOfSub(sum));
    }
}
