package Recursion;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.*;
;

public class Subset {

    public static List<List<Integer>> subset(int nums[]){
        Set<List<Integer>> ans =new  HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        ans.add(new ArrayList<>());
        res.add(new ArrayList<>());
        for(int num : nums){
            int n =res.size();
            for(int  i = 0; i < n; i++){
                List<Integer> newsub = new ArrayList<>(res.get(i));
                newsub.add(num);
                List<Integer> sorted = new ArrayList<>( newsub);
                Collections.sort(sorted);
                if(ans.add(sorted)){
                    res.add(newsub);
                }

             }
        }
      return res;

    }
    public static void main(String[] args) {
   int nums[] = {1,2,2};

     System.out.println(subset(nums));
    }
}
