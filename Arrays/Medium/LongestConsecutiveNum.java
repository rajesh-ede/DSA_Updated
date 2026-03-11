package Arrays.Medium;
import java.util.*;

public class LongestConsecutiveNum{
public static int longest(int nums[]){
     HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longest = 0;

        for(int num : set){

            if(!set.contains(num - 1)){

                int current = num;
                int count = 1;

                while(set.contains(current + 1)){
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
}
// Brute Force Solution
// public class LongestConsecutiveNum {
//     public static boolean Linear(int []nums,int target){
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] == target){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static int Longest(int nums[]){
//         int longest = 0;
//         for(int i = 0; i < nums.length; i++){
//             int current = nums[i];
//             int count = 1;
//             while(Linear(nums,current+1)){
//                 count++;
//                 current++;
//             }
//             longest = Math.max(count,current);
//         }
//         return longest;
//     }
    public static void main(String[] args) {
        int nums[] = {100,4,200,1,3,2};
        System.out.println(longest(nums));
    }
}
