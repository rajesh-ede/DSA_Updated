package LeetCode.March2026;

public class day8 {
    private static String findDifferentBinaryString(String nums[]){
        int n = nums.length;
        char[] ans = new char[n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[i].charAt(i) == '0' ? '1' : '0';
        }
        return new String(ans);
    }
    public static void main(String[] args) {
        String s[] = {"00","10"};
        String ans  =  findDifferentBinaryString(s);
        System.out.println(ans);
    }
    
}
