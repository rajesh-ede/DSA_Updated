package SlindingWindow;

public class OptimalMax {
    static int Maximun(int[]arr,int k){
        int n = arr.length;
        int lsum = 0;
        for(int i = 0; i < k; i++){
            lsum += arr[i];
        }
        int maxSum = lsum, rsum = 0;
        for(int i = 0; i < k; i++){
            // Removing elemnt from front
            lsum -=arr[k-1-i];                        //Time Complexity: O(k)  -- k means size of window
            // Adding element at end                   //Space Complexity: O(1)
            rsum +=arr[n-1-i];

        }
        maxSum = Math.max(maxSum,lsum+rsum);
      return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 3;
        int res = Maximun(arr,k);
        System.out.println(res);
    }
}
