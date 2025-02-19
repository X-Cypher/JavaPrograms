public class buyAndSellStocks {
    public static int stocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] > buyPrice){
                int todayProfit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, todayProfit);
            } else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,5,3,5,6,3};
        System.out.println("The maximum profit is : " + stocks(prices));
    }
}
