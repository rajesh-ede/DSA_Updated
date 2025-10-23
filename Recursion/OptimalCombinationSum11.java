package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
                                          // LeetCode 40
public class OptimalCombinationSum11 {
    public static void backtrack(int []arr,int target,int index,List<Integer> current,List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(current));        // Time Complexity O(2^n)
            return;
        }
        for(int i = index; i < arr.length; i++){
            if(i > index && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;

            current.add(arr[i]);
            backtrack(arr,target-arr[i],index+1,current,res);
            current.remove(current.size()-1);
        }
    }
    public static List<List<Integer>> Combination(int []candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(candidates,target,0,new ArrayList<>(),res);
        return res;
    }
    public static void main(String[] args) {
        int v[] = {2,5,2,1,2};
        int target = 5;
      List<List<Integer>> ans = Combination(v,target);
      System.out.println(ans.toString());

    }
}
