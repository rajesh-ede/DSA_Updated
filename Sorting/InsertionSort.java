package Sorting;

public class InsertionSort {
    public static void Insertion(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num [] = {4,7,1,3,2,0};
        Insertion(num);
    }
    
}
