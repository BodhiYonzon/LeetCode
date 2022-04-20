class Solution {
    int dp[][];
    public int maxProfit(int[] prices) {
        dp=new int[prices.length][prices.length+1];
        for(int[]i:dp)
            Arrays.fill(i,-1);
        return max(prices,0,-1);
    }
    int max(int[] a,int k,int cost){
        if(k>=a.length)
            return 0;
        if(cost==-1&&dp[k][a.length]!=-1)
            return dp[k][a.length];
        if(cost!=-1&&dp[k][cost]!=-1)
            return dp[k][cost];
        if(k==0||cost==-1||a[cost]>=a[k]){
            cost=k;
            dp[k][a.length]=max(a,k+1,cost);
            return dp[k][a.length];
        }
        dp[k][cost]=Math.max(a[k]-a[cost]+max(a,k+2,-1),max(a,k+1,cost));
        return dp[k][cost];
    }
}