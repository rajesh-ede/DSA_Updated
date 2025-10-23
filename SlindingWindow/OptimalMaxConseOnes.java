package SlindingWindow;

public class OptimalMaxConseOnes {
    static int Consec(int[]arr,int k){
        int res = 0, left = 0, right = 0, zero = 0;
        while(right < arr.length){

            if(arr[right] == 0){
                zero++;
            }
//            while(zero > k){                                       // Time Complexity O(n)
                                                                      // WorstCase O(n + n) --> O(2n)
//                if(arr[left] == 0){                                // Space Complexity O(1)
//                    zero--;
//                }
//                left++;
//            }
//            res = Math.max(res, right - left + 1);

            if(zero > k){
                if(arr[left] == 0){           //This is exstrem  Optimal Solution
                    zero--;
                    left++;
                }
            }
            if(zero <= k){                                   // Time Complexity O(n)
                res = Math.max(res, right - left + 1);
            }
            right++;
        }
        return res;
    }
    public static void main(String[] args) {
      int [] arr = {1,1,1,0,0,0,1,1,1,1,0};
      int k = 3;
      int ans  = Consec(arr,k);
      System.out.println(ans);
    }
}
