package March2026;
//  1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
public class day1 {
    private static int DeciBinary(String s){
       int max = 0;
      for(char c : s.toCharArray()){
        int digit = c - '0';
        max = Math.max(max,digit);
      }
      return max;
    }
    public static void main(String[] args) {
        String s = "34709";
        int ans = DeciBinary(s);
        System.out.println(ans);
    }
}
