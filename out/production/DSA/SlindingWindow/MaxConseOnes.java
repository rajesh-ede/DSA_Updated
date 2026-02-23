package SlindingWindow;

public class MaxConseOnes {
    static int Conse(int []arr,int k){
        int n = arr.length;
        int maxLen = 0;
        for(int i = 0; i < n; i++){
            int zero = 0;
            for(int j = i; j < n; j++){          //Time Complexity O(n^2)
                if(arr[j] == 0){                 // Space Complexity O(1)
                    zero++;
                }
                if(zero <= k){
                    int len = j - i + 1;
                    maxLen = Math.max(maxLen,len);
                }else{
                    break;
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 3;
        int ans = Conse(arr,k);
        System.out.println(ans);
    }
}

/* Given a binary array nums and an integer k, flip at most k 0's.
Return the maximum number of consecutive 1's after performing the flipping operation.

Input : nums = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0] , k = 3
Output : 10
Explanation : The maximum number of consecutive 1's are obtained only if we flip the 0's present
              at position 3, 4, 5 (0 base indexing).
The array after flipping becomes [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0].
The number of consecutive 1's is 10.
*/
