package Arrays.Easy;

import java.util.Arrays;

public class Moveallzeros {
    public static void Moveallzeros(int arr[]){
        int position = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
               arr[position] = arr[i];
               position++;
            }
        }
        while(position < arr.length){
            arr[position++] = 0;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,0,5,0,7,0};
        
        System.out.println("Before: " + Arrays.toString(nums));

        Moveallzeros(nums);

        System.out.println("After : " + Arrays.toString(nums));
      
    }
}

