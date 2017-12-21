class buyAndSaleStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }

    public static void main(String[] args){
        buyAndSaleStock obj = new buyAndSaleStock();
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Max profit: "+obj.maxProfit(prices));
    }
}