class Solution {
    public int[] twoSum(int[] n, int target) {
        int smol=0,big=n.length-1;
        int[] a;
        while(n[big]+n[smol]<target){
            smol++;
        }
        while(n[big]+n[smol]!=target){
            if(n[big]+n[smol]>target)
                big--;
            else
                smol++;
        }
        a=new int[]{smol+1,big+1};
        return a;
    }
}