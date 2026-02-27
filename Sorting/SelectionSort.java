package Sorting;

public class SelectionSort {
    private static void Selection(int []arr){
        int n = arr.length;
        for(int i = 0; i < n -1; i++){
            int minIdx = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[] = {3,6,1,2,0};
        Selection(num);
        
    }
}
