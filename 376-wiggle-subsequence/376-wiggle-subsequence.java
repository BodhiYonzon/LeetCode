class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<2)
            return nums.length;
        long c=0;
        int num=nums[0];
        int len=1;
        for(int i=1;i<nums.length;i++){
            if(c==0){
                while(i<nums.length&&nums[i]==num)
                    i++;
                if(i==nums.length)
                    return len;
                c=nums[i]-num;
            }
            if(nums[i]>num){
                if(c<0)
                    num=nums[i];
                if(c>0){
                    c=-1;
                    num=nums[i];
                    len++;
                }
            }
            if(nums[i]<num){
                if(c>0)
                    num=nums[i];
                if(c<0){
                    c=1;
                    num=nums[i];
                    len++;
                }
            }
        }
        return len;
    }
}