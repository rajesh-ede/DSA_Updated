package Arrays.Easy;
import java.util.Scanner;
public class SumofArrays {
    public static int SumOfArr(int[] arr, int k){
        int n = arr.length;
        
        int sum = 0;
        for(int i = 0; i < k; i++){
           sum += arr[i];
        }
        int maxsum = sum;
        for(int i = k; i < n; i++){
            sum = sum + arr[i] - arr[i-k];
            maxsum = Math.max(maxsum,sum);
        }
       return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
         int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = SumOfArr(arr,k);

        System.out.print(ans);
    }
    
}
