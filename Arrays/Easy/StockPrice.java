package Arrays.Easy;

public class StockPrice {
    private static int Stcok(int prices[]){
        int choice = prices[0];
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < choice){
                choice = prices[i];
            }else if(prices[i] - choice > profit){
                profit = prices[i] - choice;
            } 
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.print(Stcok(prices));
    }
    
}
