package Arrays.Medium;
//Leet Code 53
public class MaximumSubArray {
// Optimal by Kadane's Algorithm O(n)
private static int OptMax(int[] nums){
    int ans = nums[0];
    int sum = 0;
    for(int num : nums){
       sum += num;
       ans = Math.max(ans,sum);

       if(sum < 0){
        sum = 0;
       }
    }
    return ans;
}

    //Brute Force Approach O(n^2)
    private static int Max(int nums[]){
        int max = Integer.MIN_VALUE;
       
        for(int i = 0; i < nums.length; i++){
             int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                max = Math.max(max,sum);
            }
        }
        return max;
    } 
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        
        System.out.println(OptMax(nums));
    }
    
}
