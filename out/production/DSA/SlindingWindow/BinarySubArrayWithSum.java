package SlindingWindow;

public class BinarySubArrayWithSum {
    static int Binary(int []arr,int S){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;                            // Time Complexity O(n^2)
            for (int j = i; j < n; j++){            // Space Compelexity O(1)
                sum += arr[j];
                if(sum == S){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
    int arr[] = {1, 1, 0, 1, 0, 0, 1};
    int goal = 3;
    System.out.println(Binary(arr,goal));
    }
}

               // Question
/* Given a binary array nums and an integer goal. Return the number of non-empty subarrays with a sum goal.
A subarray is a continuous part of the array.

Input : nums = [1, 1, 0, 1, 0, 0, 1] , goal = 3
Output : 4
Explanation : The subarray with sum 3 are
[1, 1, 0, 1]
[1, 1, 0, 1, 0]
[1, 1, 0, 1, 0, 0]
[1, 0, 1, 0, 0, 1].
 */
