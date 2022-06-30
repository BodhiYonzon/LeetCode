class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        long moves=0;
        for(int i=1;i<n;i++){
            moves+=nums[i]-nums[0];
        }
        long min=moves;
        for(int i=1;i<n;i++){
            int diff=-nums[i-1];
            while(i<n-1&&nums[i]==nums[i-1])
                i++;
            diff+=nums[i];
            moves+=diff*i;
            moves-=diff*(n-i);
            if(moves<min)
                min=moves;
        }
        return (int)min;
    }
}