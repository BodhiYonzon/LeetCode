class Solution {
    public int trap(int[] a) {
        int n=a.length;
        int ans=0,water=0,max=0,cur=a[0];
        for(int i=0;i<n;i++){
            if(a[max]<a[i])
                max=i;
        }
        for(int i=0;i<=max;i++){
            if(cur<=a[i]){
                cur=a[i];
                ans+=water;
                water=0;
            }
            else{
                water+=cur-a[i];
            }
        }
        cur=a[n-1];
        for(int i=n-1;i>=max;i--){
            if(cur<=a[i]){
                cur=a[i];
                ans+=water;
                water=0;
            }
            else{
                water+=cur-a[i];
            }
        }
        return ans;
    }
}