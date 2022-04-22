class Solution {
    String s;
    int []dp;
    public int numDecodings(String s) {
        dp=new int[s.length()];
        Arrays.fill(dp,-1);
        this.s=s;
        return decode(0);
    }
    int decode(int in){
        if(in>=s.length())
            return 1;
        if(s.charAt(in)=='0')
            return 0;
        if(in==s.length()-1)
            return 1;
        if(dp[in]!=-1)
            return dp[in];
        if(s.charAt(in)=='1'){
            if(s.charAt(in+1)=='0')
                dp[in]=decode(in+2);
            else
                dp[in]=decode(in+2)+decode(in+1);
        }
        else if(s.charAt(in)=='2'){
            if(s.charAt(in+1)=='0')
                dp[in]=decode(in+2);
            else if(s.charAt(in+1)>='7')
                dp[in]=decode(in+1);
            else
                dp[in]=decode(in+1)+decode(in+2);
        }
        else
            dp[in]=decode(in+1);
        return dp[in];
    }
}