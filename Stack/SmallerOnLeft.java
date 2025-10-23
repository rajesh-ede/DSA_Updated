package Stack;
import java.util.Arrays;
public class SmallerOnLeft {
    public static int []samll (int[] arr){
        int n = arr.length;
       int res[] = new int[n];
       res[0] = -1;
       for(int i = 0; i < n; i++){
           for(int j = i-1; j >= 0; j--){
               if(arr[j] < arr[i]){
                   res[i] = arr[j];
                   break;
               }
           }
       }
       return res;
    }
    public static void main(String[] args) {
     int [] arr = {1, 6, 2};
     System.out.println(Arrays.toString(samll(arr)));
    }
}
