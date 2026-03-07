package Arrays.Medium;

import java.util.*;

public class AddTwo {
    //Brute Force Approach
    private static int[] Two(int arr[], int target){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    // Optimal Solution
    private static int[] Add(int arr[],int target){
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < arr.length;  i++){
            int complement = target  - arr[i];
            if(mp.containsKey(complement)){
                return new int[]{mp.get(complement),i};
            }
            mp.put(arr[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int nums[] = {1,5,10,7};
        int target = 15;
        int [] ans = Add(nums,target);
        for(int num : ans){
            System.out.print( num +" ");

        }
        System.err.println();

    }
    
}
