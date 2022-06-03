class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1]<target)
            return nums.length;
        if(nums[0]>target)
            return 0;
        return binsearch(nums,0,nums.length-1,target);
    }
    public int binsearch(int a [],int start,int end,int target){
        int mid=(start+end)/2;
        if(a[mid]==target)
            return mid;
        if(mid==start)
            return mid+1;
        if(a[mid]>target)
            return binsearch(a,start,mid,target);
        else
            return binsearch(a,mid,end,target);
    }
}