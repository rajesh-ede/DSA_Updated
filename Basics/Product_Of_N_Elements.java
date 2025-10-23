package Basics;

public class Product_Of_N_Elements {
    static int Product(int q){
        if(q%10 == q){
            return q;
        }
        return (q%10) * Product(q/10);
    }
    public static void main(String[] args) {
        int s = 1345;
        System.out.println(Product(s));
    }
}
