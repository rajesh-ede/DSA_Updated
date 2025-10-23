package Stack;

import java.util.Arrays;

public class NextGreaterElementsTwoArrays {
    public static int[] nextGreater(int num1[],int num2[]){
     int ans[] = new int[num1.length];                                   // Time Complexity O(n.m)
     for(int i = 0; i < num1.length; i++){                               // Space complexity O(n)
         int index = -1;
         for(int j = 0; j < num2.length; j++){
             if(num2[j] == num1[i]){
                 index = j;
                 break;
             }
         }
         int grater = -1;
         for(int k = index+1; k < num2.length; k++){
             if(num2[k] > num1[i]){
                 grater = num2[k];
                 break;
             }
         }

         ans[i] = grater;
     }
     return ans;
    }
    public static void main(String[] args) {
       int num1[] = {4,1,2};
       int num2[] = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreater(num1,num2)));;
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