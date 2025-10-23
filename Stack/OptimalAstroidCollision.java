package Stack;
import java.util.Arrays;
import java.util.Stack;
public class OptimalAstroidCollision {                      // LeetCode 7345
    public static int[] Next(int[] arr){
         Stack<Integer> st =new Stack<>();
         for(int a : arr){                                  // Time Complexity O(n)
           boolean destroy = false;                         // Space Complexity O(n)
           while(!st.isEmpty() && a < 0 && st.peek() > 0){
               if(st.peek() < -a){
                   st.pop();
               } else if (st.peek() == -a) {
                   st.pop();
                   destroy = true;
                   break;
               }else {
                   destroy = true;
                   break;
               }
           }
           if(!destroy){
               st.push(a);
           }
         }
         int result[] = new int[st.size()];
         for(int i = st.size() - 1; i >= 0; i--){
             result[i] = st.pop();
         }
         return result;
    }
    public static void main(String[] args) {
        int res[] = {5, 10, -5};
        int ans [] = Next(res);
        System.out.println(Arrays.toString(ans));
    }
}
