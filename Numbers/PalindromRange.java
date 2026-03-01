package Numbers;

public class PalindromRange {
    public static boolean isPalin(int num){
        int dup = num;
        int revN = 0;
        if(num < 0){
            return false;
        }
        while(num != 0){
            int last = num % 10;
            revN = (revN * 10) + last;
            num = num / 10;
        }
        return dup == revN;
    }
    public static void Series(int min,int max){
        for(int i = min; i < max; i++){
            if(isPalin(i)){
                System.out.print(i + " ");
            }
            
        }
    }
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        Series(min,max);
    }
    
}
