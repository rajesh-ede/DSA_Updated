package LeetCode.March2026;

public class day7 {
    public static int Alternative (String s){
        int n = s.length();
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i< n;i++){
            String rotated = s.substring(i)+s.substring(0,i);
            int flip1 = 0, flip2 = 0;
            for(int j = 0; j<n; j++){
                char excepted1 = (j%2 == 0) ? '0' : '1';
                char excepted2 = (j%2 == 0) ? '1' : '0';

                if(rotated.charAt(j) != excepted1) flip1++;
                if(rotated.charAt(j) != excepted2) flip2++;
                
            }
            ans = Math.min(ans, Math.min(flip1,flip2));
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "111000";
        System.out.println(Alternative(s));
    }

}
