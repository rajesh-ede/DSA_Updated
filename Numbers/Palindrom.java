package Numbers;

public class Palindrom {
    public static boolean isPalindrom(int n){
        int revNum = 0;
        int dup = n;
        if(n < 0) return false;
        while( n != 0){
            int last = n % 10;
            revNum = (revNum * 10)+ last;
            n = n / 10;
        }
        return dup == revNum;
    }
    public static void main(String[] args) {
        int num= 122;
        System.out.println(isPalindrom(num));
    }
    
}
