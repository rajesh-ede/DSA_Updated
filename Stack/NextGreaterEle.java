package Stack;
import java.util.Arrays;
public class NextGreaterEle {
    public static int[] nextGreater(int[] arr){
        int n = arr.length;
        int []result = new int[n];
        for(int i = 0; i < n; i++){        //Time Complexity O(n^2)
            result[i] = -1;               // Space Complexity O(n)-
            for(int j = i+1; j < n; j++){
                if(arr[j] > arr[i]){
                    result[i] = arr[j];
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arr = {1, 3, 2, 4};
        System.out.println(Arrays.toString(nextGreater(arr)));
    }
}
