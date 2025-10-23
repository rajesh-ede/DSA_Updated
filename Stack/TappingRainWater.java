package Stack;



public class TappingRainWater {
    public static int Water(int[] arr){
        int n = arr.length;
         int  water = 0;
        for(int i = 0 ; i < n; i++){           // TimeComplexity O(n^2)
            int leftmax = 0, rightmax =0;      // SpaceComplexity O(1)
            for(int j = 0; j <= i; j++){
                leftmax =Math.max(leftmax, arr[j]) ;
            }
            for(int j = i; j < n; j++){
                rightmax =Math.max(rightmax,arr[j]) ;
            }
            water += Math.min(leftmax,rightmax) - arr[i];
        }
        return water;
    }
    public static void main(String[] args) {
     int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
     System.out.println(Water(arr));
    }
}
/*
Given an array of non-negative integers, height representing the elevation of ground.
Calculate the amount of water that can be trapped after rain.

Input: height= [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
Output: 6
Explanation: As seen from the diagram 1+1+2+1+1=6 unit of water can be trapped
 */
