class Solution {
    int dp[];
    String s;
    List<String>dic;
    public boolean wordBreak(String s, List<String> wordDict) {
        this.s=s;
        this.dic=wordDict;
        Collections.sort(dic,(a,b)->(b.length()-a.length()));
        dp=new int[s.length()];
        return find(0);
    }
    boolean find(int in){
        if(in>=s.length())
            return true;
        if(dp[in]!=0)
            return dp[in]==1;
        String x=s.substring(in);
        for(String word:dic){
            if(x.startsWith(word)){
                if(find(in+word.length())){
                    dp[in]=1;
                    return true;
                }
            }
        }
        dp[in]=-1;
        return false;
    }
}