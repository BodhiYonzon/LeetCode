class Solution {
    public int getMaxLen(int[] nums) {
        int n=nums.length,ans=0,cur=0,neg=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                cur=0;
                neg=0;
                continue;
            }
            cur++;
            if(nums[i]<0)
                neg++;
            if(neg%2==0)
                ans=Math.max(ans,cur);
        }
        cur=neg=0;
        for(int i=n-1;i>=0;i--){
            if(nums[i]==0){
                cur=0;
                neg=0;
                continue;
            }
            cur++;
            if(nums[i]<0)
                neg++;
            if(neg%2==0)
                ans=Math.max(ans,cur);
        }
        return ans;
    }
}