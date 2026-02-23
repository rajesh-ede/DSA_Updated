package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
                              // LeetCode 90
public class OptimalSubset {
    public static  void backtrack(int []nums,int index,List<Integer> current , List<List<Integer>> ans){
        ans.add(new ArrayList<>(current));

        for(int i = index; i < nums.length; i++){
            current.add(nums[i]);
            backtrack(nums,i+1,current,ans);
            current.remove(current.size()-1);
        }
    }

    public static List<List<Integer>> subset(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,new ArrayList<>(),res);
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2};
    List<List<Integer>> ans = subset(nums);
        System.out.println(ans.toString());
    }
}
