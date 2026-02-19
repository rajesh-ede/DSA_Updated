package Recursion;

     // LeetCode 17
    /* Letter Combinations of a Phone Number  */



import java.util.ArrayList;
import java.util.List;

public class LCPN {
   static List<String > ans = null;
    static String[] map = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static  List<String> letterCombinations(String digits){
     ans = new ArrayList<>();
      dfs(0,digits,new StringBuilder());
     return ans;
    }
    public static void dfs(int len, String digit,StringBuilder temp ){
        if(len == digit.length()){
            ans.add(temp.toString());
            return;
        }
        char ch = digit.charAt(len);
        String str = map[ch-'0'];
        for(char c: str.toCharArray()){
            temp.append(c);
            dfs(len+1,digit,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public static void main(String[] args) {
       String digits = "24";
       List<String> lis = letterCombinations(digits);

       for(String com : lis){
           System.out.print(com+ " ");
       }
    }

}
