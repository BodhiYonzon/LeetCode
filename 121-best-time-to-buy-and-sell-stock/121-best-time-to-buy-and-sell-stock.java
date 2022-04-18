class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;
        int x=0, min=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min)
                min=prices[i];
            else if(prices[i]-min>x)
                x=prices[i]-min;
        }
        return x;
    }
}