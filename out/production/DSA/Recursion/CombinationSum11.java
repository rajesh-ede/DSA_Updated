package Recursion;
import java.util.*;
                                    // LeetCode 40
public class CombinationSum11 {
    public static void backtrack(int [] arr, int target, int index, List<Integer> current, Set<List<Integer>> ans){
       if(index == arr.length){
           if(target == 0){
               ans.add(new ArrayList<>(current));
           }
           return;
       }if(arr[index] <= target) {
            current.add(arr[index]);
            backtrack(arr, target - arr[index], index + 1, current, ans);
            current.remove(current.size() - 1);
        }
       backtrack(arr,target,index+1,current,ans);
    }
    public static List<List<Integer>> CombinationSum(int[] candidates, int target){
        Arrays.sort(candidates);
        Set<List<Integer>> ans = new HashSet<>();
      backtrack(candidates,target,0,new ArrayList<>(),ans);
        return new ArrayList<>(ans);
    }
    public static void main(String[] args) {
     int V[] ={2,5,2,1,2};
     int target = 5;
     List<List<Integer>>  ans = CombinationSum(V,target);
     System.out.println(ans.toString());
    }
}
