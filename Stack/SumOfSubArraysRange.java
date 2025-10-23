package Stack;

public class SumOfSubArraysRange {                                         // leetcode :2104. Sum of Subarray Ranges
     public static int SubRange(int []arr){
         int n = arr.length;
         int sum = 0;
         for(int i = 0; i < n; i++){
             int largest = arr[i], smalleast = arr[i];                   // TimeComplexity o(n^2)
             for(int j = i+1; j < n; j++){                               // SpaceComplexity O(1)
                 largest = Math.max(largest, arr[j]);
                 smalleast = Math.min(smalleast, arr[j]);

                   sum += largest-smalleast;
             }
         }
         return sum;
     }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(SubRange(arr));
    }
}
