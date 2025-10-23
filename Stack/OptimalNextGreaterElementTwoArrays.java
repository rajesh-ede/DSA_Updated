package Stack;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
public class OptimalNextGreaterElementTwoArrays {
    public static int []NextGreater(int num1[],int num2[]){
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int []ans = new int[num1.length];                       // Time Complexity O(n + m)
        for(int num : num2){                                    // Space Complexity O(M)
            while(!st.isEmpty() && num > st.peek()){
                 map.put(st.pop(), num);
            }
            st.push(num);
        }
        int i = 0;
        for(int num : num1){
            ans[i++] = map.getOrDefault(num,-1);
        }
        return ans;
    }
    public static void main(String[] args) {
     int num1[] = {4,1,2};
     int num2[] = {1,3,4,2};
    System.out.println(Arrays.toString(NextGreater(num1,num2)));
     }
}

/*
Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
 */