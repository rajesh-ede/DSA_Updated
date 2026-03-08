package Arrays.Medium;

public class SortArray012 {
    private static void sortColours(int nums[]){
        int n = nums.length;
        int low = 0, mid = 0, high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low++] = nums[mid];
                nums[mid++] = temp;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp  = nums[mid];
                nums[mid] = nums[high];
                nums[high--] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,0,0,2,2,1};
        sortColours(nums);

        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
