package March2026;
// 1545. Find Kth Bit in Nth Binary String
public class day3 {
private  static char findFlip(int n, int k){
    boolean flip = false;
    while(n > 1){
        int length = (1 << n) - 1;
        int mid = (length+1)/2;

        if(mid == k){
            return flip ? '0' : '1';
        }
        if(k > mid){
            k = (length - k) + 1;
            flip = !flip;
        }
        n--;
    }
    return flip ? '1' : '0';
}
public static void main(String[] args) {
    int n = 4;
    int k = 11 ;
    char c = findFlip(n,k);
    System.out.println(c);
}
    
}