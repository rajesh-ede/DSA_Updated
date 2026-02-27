package Sorting;
public class QuickSort {
    public static int Partition(int[] nums,int low,int high){
         int pivot = nums[high];
         int i = low - 1;
         for(int j = low; j < high; j++){
            if(nums[j] <= pivot){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

            }
         }
         int temp = nums[i+1];
         nums[i+1] = nums[high];
         nums[high] = temp;

         return i+1;
    }
    private static void Quick(int[] nums,int low,int high){
        if(low < high){
            int partition = Partition(nums,low,high);

            Quick(nums,low,partition-1);
            Quick(nums,partition+1,high);
        }
    }
    public static void main(String[] args) {
        int nums[] = {2,6,8,9,2,1};
       Quick(nums,0,nums.length-1);
       for(int num : nums){
        System.out.print(num + " ");
       }
       System.out.println();
    }
    
}
