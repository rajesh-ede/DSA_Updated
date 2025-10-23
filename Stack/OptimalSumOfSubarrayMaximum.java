package Stack;
import java.util.Stack;
public class OptimalSumOfSubarrayMaximum {
    public static int Maximum(int[] arr){
        int n = arr.length;
        int[] Ple = new int[n];
        int[] Nle = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.empty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            Ple[i] = st.isEmpty() ? -1: st.peek();
            st.push(i);
        }
        st.clear();
        for(int j = n-1; j >= 0; j--){
            while(!st.empty() && arr[st.peek()] < arr[j]){
                st.pop();
            }
            Nle[j] = st.isEmpty() ? n : st.peek();
            st.push(j);
        }
        long total = 0;
        for(int i = 0 ; i < n; i++){
            long left = i - Ple[i];
            long right = Nle[i] - i;

            total += (long) arr[i] * left * right;
        }
        return (int)total;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        System.out.println(Maximum(arr));
    }
}
