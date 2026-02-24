package Strings;

public class Pailndrom2 {
    private static boolean isPailnd(String s, int l,int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static boolean Pailnd(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return isPailnd(s,left+1,right) || isPailnd(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(Pailnd(s));
    }
}
