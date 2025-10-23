package Basics;

public class Count_num_of_Zeros {
    static int Count(int n){
        return helper(n,0);
    }
    static int helper(int s, int c){
        if(s == 0){
            return c;
        }
        int rem = s % 10;
        if( rem == 0){
            return helper(s/10, c+1);
        }
        return helper(s/10, c);
    }
    public static void main(String[] args) {
      int a = 400900;
        System.out.println(Count(a));
    }
}
