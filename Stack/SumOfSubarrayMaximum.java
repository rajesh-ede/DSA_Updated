package Stack;

public class SumOfSubarrayMaximum {
    public static int Maximum(int[]arr){
        int n = arr.length;
        int max = 0, total = 0;
        for(int i = 0; i < n; i++){
            max = arr[i];
            for(int j = i; j < n; j++){
                max = Math.max(max,arr[j]);

                total += max;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int []arr = {3, 1, 2, 4};
        System.out.println(Maximum(arr));

    }
}
