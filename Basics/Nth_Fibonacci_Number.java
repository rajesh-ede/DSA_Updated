package Basics;

public class Nth_Fibonacci_Number {           // Fibonacci Numbers : 0 , 1, 1, 2, 3, 5, 8,13, 21, .....
    static int fibon(int n){
        // Base Condition
        if(n < 2){                            // It not Efficient for large numbers Ex. fibon(50) Because of Internal Tree
                                               //  duplication
            return n;
        }
        return fibon(n-1)+fibon(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibon(50));
    }
}
