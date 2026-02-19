package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void backtrack(int arr[], int target, int index, List<Integer> current, List<List<Integer>> ans){
        if(index == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(current));
            }
            return;
        }
        if(arr[index] <= target) {
            current.add(arr[index]);
            backtrack(arr, target - arr[index], index, current, ans);
            current.remove(current.size() - 1);
        }
        backtrack(arr,target,index+1,current,ans);
    }
    public static List<List<Integer>> Combination(int[] candidates,int target){
        List<List<Integer>> ans = new ArrayList<>();
     backtrack(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
    public static void main(String[] args) {
      int candidates[] = {2,3,6,7};
      int target = 7;
      List<List<Integer>> ans = Combination(candidates,target);
      System.out.println(ans.toString());
    }
}
