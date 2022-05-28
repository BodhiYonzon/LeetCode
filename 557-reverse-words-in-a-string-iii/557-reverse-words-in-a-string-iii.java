class Solution {
    public String reverseWords(String s) {
        String t="",r="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                t+=r+' ';
                r="";
            }
            else
                r=s.charAt(i)+r;
        }
        t+=r;
        return t;
    }
}