class Solution {
    public int maximum69Number (int num) {
        int a=0;
        while(num!=0){
            a*=10;
            a+=num%10;
            num=num/10;
        }
        while(a!=0){
            num*=10;
            if(a%10==6){
                a/=10;
                num+=9;
                break;
            }
            num+=a%10;
            a/=10;
        }
        while(a!=0){
            num*=10;
            num+=a%10;
            a/=10;
        }
        return num;
    }
}