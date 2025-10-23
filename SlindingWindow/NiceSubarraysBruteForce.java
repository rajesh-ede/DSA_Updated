package SlindingWindow;

public class NiceSubarraysBruteForce {
    static int Nice(int []arr,int k){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int oddSum = 0;
            for(int j = i; j < n ; j++){          // Time Complexity O(n^2)
                if(arr[j] % 2 == 1){              // Space Complexity O(1)
                    oddSum++;
                }
                if(oddSum == k){
                    count++;
                } else if (oddSum > k) {
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 1, 1};
        int k = 3;
        System.out.println(Nice(arr,k));
    }
}

                  // Question
/*Given an array nums and an integer k. An array is called nice if and only if it contains k odd numbers.
Find the number of nice subarrays in the given array nums.
A subarray is continuous part of the array.


Input : nums = [1, 1, 2, 1, 1] , k = 3
Output : 2
Explanation : The subarrays with three odd numbers are
[1, 1, 2, 1]
[1, 2, 1, 1]
 */
