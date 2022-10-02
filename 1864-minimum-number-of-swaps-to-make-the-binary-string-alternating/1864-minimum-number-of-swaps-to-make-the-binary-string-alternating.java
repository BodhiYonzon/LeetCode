class Solution {
    public int minSwaps(String s) {
        int c1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                c1++;
        }
        if(s.length()%2==0&&c1*2!=s.length())
            return -1;
        if(s.length()%2==1&&!(c1*2==s.length()+1||c1*2==s.length()-1)){
            return -1;
        }
        int a=-1,ans=0;
        if(c1*2>s.length()) a=-a;
        String t="";
        for(int i=0;i<s.length();i++){
            if(a<0)
                t=t+'0';
            else
                t=t+'1';
            a=-a;
        }
        for(int i=0;i<s.length();i++){
            if(t.charAt(i)!=s.charAt(i))
                ans++;
        }
        if(s.length()%2==0){
            ans=Math.min(ans,s.length()-ans);
        }
        return ans/2;
    }
}