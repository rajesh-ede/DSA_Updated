package LeetCode.March2026;
//1784. Check if Binary String Has at Most One Segment of Ones
public class day6 {
    private static boolean AtMostOneSigment(String s){
        int count =  0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1' && (i ==0 || s.charAt(i-1) == '0')){
                count++;
            }
        }
        if(count > 1){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "00000";
        boolean ans = AtMostOneSigment(s);
        System.out.println(ans);
    }
    
}
