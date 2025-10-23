package SlindingWindow;



public class OptimalNiceSubarraysBruteForce {
    static int AtMost(int []arr,int k){
        return Binary(arr,k) - Binary(arr,k-1);
    }

    static int Binary(int[]arr,int k){
        int n = arr.length;
        int left = 0 , ans = 0;
        for(int right = 0; right < n; right++){
            if(arr[right]%2 == 1){
                k--;
            }
            while(k < 0){
                if(arr[left] % 2 == 1){
                    k++;
                }                                  // Time Complexity O(n)
                left++;                           // Space Complexity O(1)
            }
            ans += right-left+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 1, 1};
        int k = 3;
        System.out.println(AtMost(arr,k));
    }
}
