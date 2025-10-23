package Basics;

public class Check_Array_Sorted_or_Not {
    static boolean Check(int []arr,int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && Check(arr,index+1);
    }
    public static void main(String[] args) {
     int []arr = {1,3,6,8,9,10};
     System.out.println(Check(arr,0));
    }
}
