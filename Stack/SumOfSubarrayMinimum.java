package Stack;

public class SumOfSubarrayMinimum {
    public static int SumOfSub(int []arr){
        int n = arr.length;
        int min_sum = 0;
        long total = 0;
        int mod = 1000000007;
        for(int i = 0; i < n; i++){
            min_sum = arr[i];
            for(int j = i; j < n; j++){
                min_sum = Math.min(min_sum,arr[j]);
                total = (total+min_sum) % mod;
            }
        }
        return (int) total;
    }
    public static void main(String[] args) {
      int arr[] = {3,1,2,4};
      System.out.println(SumOfSub(arr));
    }
}
