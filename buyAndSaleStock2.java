class buyAndSaleStock2 {
    public int maxProfit(int[] prices) {
       int profit=0;
       int diff=0;
       for(int i=1;i<prices.length;i++){
            diff = prices[i]-prices[i-1];
            if(diff>0){
                 profit = profit+diff;   
            }
       }
       return profit;
    }

    public static void main(String[] args){
        buyAndSaleStock2 obj = new buyAndSaleStock2();
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Max profit: "+obj.maxProfit(prices));
    }
}