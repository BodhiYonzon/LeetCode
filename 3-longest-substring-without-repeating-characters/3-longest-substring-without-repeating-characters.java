class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest=0;
        Set<Character> set=new HashSet<>();
        int j=0,len=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(set.contains(c)){
                while(s.charAt(j)!=c){
                    set.remove(s.charAt(j++));
                    len--;
                }
                j++;
            }
            else{
                set.add(c);
                len++;
                longest=Math.max(longest,len);
            }
        }
        return longest;
    }
}