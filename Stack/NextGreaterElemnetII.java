package Stack;
import java.util.Arrays;
public class NextGreaterElemnetII {
    public static int[] Greater(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {                    // TimeComplexity O(n^2)
            ans[i] = -1;                                 // Space Complexity O(1)
            for (int j = 1; j < n; j++) {
                int nextIndex = (i + j) % n; // circular wrap
                if (nums[nextIndex] > nums[i]) {
                    ans[i] = nums[nextIndex];
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
     int arr[] = {1,2,1};
     System.out.println(Arrays.toString(Greater(arr)));
    }
}
/*
Given a circular integer array arr, return the next greater element for every element in arr.

The next greater element for an element x is the first element greater than x that we come across while traversing the
array in a clockwise manner.
Input: arr = [3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9]

Output: [10, -1, 6, 6, 2, 6, 7, 7, 9, 9, 10]

Explanation: For the first element in arr i.e, 3, the greater element which comes next to it while traversing and is
closest to it is 10. Hence,10 is present on index 0 in the resultant array. Now for the second element i.e, 10, there
is no greater number and hence -1 is it’s next greater element (NGE). Similarly, we got the NGEs for all other elements
present in arr.
 */
