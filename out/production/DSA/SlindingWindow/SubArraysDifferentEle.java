package SlindingWindow;

import java.util.*;

public class SubArraysDifferentEle {
    public static int Array(int[]arr,int k){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            Set<Integer> set = new HashSet<>();       // Time Complexity O(n^2)
            for(int j = i; j < n; j++){               // Space Complexity O(1)
                set.add(arr[j]);
                if(set.size() == k){
                    count++;
                } else if (set.size() > k) {
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
       int arr[] = {1,2,1,2,3};
       int k = 2;
       System.out.println(Array(arr,k));
    }
}
         // Question
/* Given an array nums and an integer k, return the number of subarrays that contain exactly k distinct elements.

nums = [1,2,1,2,3], k = 2
Valid subarrays with exactly 2 distinct:
[1,2]
[2,1]
[1,2]
[2,3]
[1,2,1]
[2,1,2]
[1,2,3]
Count = 7
 */
