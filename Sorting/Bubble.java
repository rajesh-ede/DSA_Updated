package Sorting;

public class Bubble {
    private static void Sort(int [] arr){
        int n = arr.length;
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[] = {3,7,8,1,2};
        Sort(num);
    }
    
}
