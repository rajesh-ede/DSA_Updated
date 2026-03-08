package Arrays.Medium;

public class Majority {
    //Brute Force
    private static int maj(int nums[]){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
               if(nums[i] == nums[j]){
                count++;
               }
            }
            if(count > n/2){
                return nums[i];
            }
        }
        return -1;
    }
    // Optimal Solution Boyer–Moore Voting Algorithm
    private static int majority(int nums[]){

        int vote = 0, candidate = 0;
        for(int num : nums){
            if(vote == 0){
                candidate = num;
            }
            if(num == candidate){
                vote++;
            }else{
                vote--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2,3,3,3,5};
        int ans = maj(nums);
        System.out.println(ans);
    }
}
