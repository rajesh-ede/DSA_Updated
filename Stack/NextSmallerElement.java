package Stack;

import java.util.Arrays;

public class NextSmallerElement {
    public static int[] NextGreater(int []arr){
        int n = arr.length;                                 // Time Complexity O(n)
        int ans[] = new int[n];                             // Space Complexity O(n)
        for(int i = 0; i < n; i++){
            ans[i] = -1;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[i]){
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {4, 8, 5, 2, 25};
        System.out.println(Arrays.toString(NextGreater(arr)));
    }
}
