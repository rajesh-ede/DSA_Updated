package SlindingWindow;

public class OptimalBinarySubArrayWithSum {

    static int Binary (int[] arr,int S){

   return AtMost(arr,S) - AtMost(arr,S-1);

    }

    static int AtMost(int[]arr,int S){
        int ans = 0, left = 0, sum = 0;;                        // Time Complexity O(n)
        if(S < 0){                                              // Space Complexity O(1)
            return 0;
        }
        for(int right = 0; right < arr.length; right++){
             sum += arr[right];
             while(sum > S){
                 sum -= arr[left++];
                                                    // Main Idea is (sum=goal)=(sum≤goal)−(sum≤goal−1)
             }
             ans += right-left+1;
        }
        return  ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 0, 0, 1};
        int goal = 3;
        System.out.println(Binary(arr,goal));
    }
}
