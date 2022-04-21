class Solution {
    int n,b[],s[];
    Map<Integer,Integer>[]dp;
    public int maxProfit(int[] prices, int fee) {
        n=prices.length;
        dp=new HashMap[n];
        b=prices;
        s=new int[n];
        for(int i=0;i<n;i++){
            s[i]=prices[i]-fee;
        }
        return max(0,0);
    }
    int max(int k,int cost){
       if(k>=n)
           return 0;
        if(dp[k]==null)
            dp[k]=new HashMap<>();
        if(dp[k].containsKey(cost))
            return dp[k].get(cost);
        if(b[k]<=b[cost])
            cost=k;
        else if(s[k]>b[cost]){
            dp[k].put(cost,Math.max(max(k+1,cost),s[k]-b[cost]+max(k+1,k)));
            return dp[k].get(cost);
        }
        dp[k].put(cost,max(k+1,cost));
        return dp[k].get(cost);
    }
}