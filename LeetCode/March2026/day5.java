package LeetCode.March2026;
// 1758. Minimum Changes To Make Alternating Binary String
public class day5 {
    private  static int MiniMum(String s){
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < s.length(); i++){
            char expec1 = (i%2 == 0) ? '0' : '1';
            char expec2 = (i%2 == 0) ? '1' : '0';
            
            if(s.charAt(i) != expec1) count1++;
            if(s.charAt(i) != expec2) count2++;
        }
        return Math.min(count1,count2);
    }
    public static void main(String[] args) {
        String s = "01001";
        int ans = MiniMum(s);
        System.out.println(ans);
    }
    
}
