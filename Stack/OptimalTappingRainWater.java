package Stack;

public class OptimalTappingRainWater {
    public static int Water(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1, rightmax = 0, leftmax = 0, water = 0;
        while (left < right){
            if(arr[left] < arr[right]){             //TimeComplexity O(N)
                if(arr[left] >= leftmax){            // SpaceComplexity O(1)
                    leftmax = arr[left];
                }else {
                    water += leftmax - arr[left];
                }
                left++;
            }else{
                if(arr[right] >= rightmax){
                    rightmax = arr[right];
                }else {
                    water += rightmax - arr[right];
                }
                right--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
     int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
     System.out.println(Water(arr));
    }
}
