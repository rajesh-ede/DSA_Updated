package Numbers;

public class PrimeRange {
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void Range(int min,int max){
        for(int i = min; i < max; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int i = 1;
        int r = 100;
        Range(i,r);
    }
}
