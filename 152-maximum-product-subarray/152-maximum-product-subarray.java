class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int min=1,max=1;
        for(int i:nums){
            int mint=min;
            min=Math.min(Math.min(i,min*i),max*i);
            max=Math.max(Math.max(i,max*i),mint*i);
            ans=Math.max(ans,Math.max(min,max));
        }
        return ans;
    }
}