package SlindingWindow;

import java.util.*;

public class OptimalSubArraysDifferentEle {
    static  int Sub ( int arr[],int k){
        return Array(arr,k) - Array(arr,k-1);
    }
    static int Array(int[]nums,int k){
        int n = nums.length;
        int left = 0, count = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {

            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);


            while (freq.size() > k) {
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if (freq.get(nums[left]) == 0) {                   // TimeComplexity O(n)
                    freq.remove(nums[left]);                       // Space Complexity O(1)
                }
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,3};
        int k = 2;
        System.out.println(Sub(arr,k));
    }
}
