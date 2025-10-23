package Stack;
import java.util.Stack;
import java.util.Arrays;
public class OptimalSmallerOnLeft {
    public static int[]Small(int[] arr){
        int n = arr.length;
        int[] res =  new int[n];
        Stack<Integer> st = new Stack();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
     int []arr = {1,6,4};
     System.out.println(Arrays.toString(Small(arr)));
    }
}
