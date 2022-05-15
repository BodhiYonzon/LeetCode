class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        int i=0;
        while(i<nums.length-2){
            int x=i+1,y=nums.length-1;
            while(x<y){
                int sum=nums[i]+nums[x]+nums[y];
                if(sum>0)   y--;
                else if(sum<0) x++;
                else{
                    list.add(new ArrayList<>(Arrays.asList(nums[i],nums[x],nums[y])));
                    while(x<nums.length-1&&nums[x]==nums[x+1])
                        x++;
                    x++;
                }
            }
            while(i<nums.length-1&&nums[i]==nums[i+1])
                i++;
            i++;
        }
        return list;
    }
}