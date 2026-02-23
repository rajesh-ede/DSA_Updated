package Strings;

public class Pailndrom {

    // This Method 1 is brute force approach it having TimeComplexity O(n) and SpaceComplexity O(1)
    public static boolean IsPailndrom(String s){
        int left = 0, right = s.length()-1;
        while (left < right) {
            if(!Character.isLetterOrDigit(s.charAt(left))){
               left++;
            }else if(!Character.isLetterOrDigit(s.charAt(right))){
               right--;
            }else if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
              return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
    // This Method 2 Using Recursion it takes TimeComplexity O(n) and SpaceComplexity O(n)
    private static boolean check(String s, int l , int r){
       if ( l >= r){
        return true;
       }
       if(s.charAt(l) != s.charAt(r)){
        return false;
       }
       return check(s,l+1,r-1);
    }
    public static boolean ispaindrom(String s){
        return check(s,0,s.length()-1);
    }
    public static void main(String[] args) {
        String s = "Rajesh";
        System.out.println(IsPailndrom(s));
         System.out.println(ispaindrom(s));
    }
    
}
