class Solution {
    public int maxNumberOfBalloons(String text) {
        int a[]=new int[5];
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(c=='b')
                a[0]++;
            else if(c=='a')
                a[1]++;
            else if(c=='l')
                a[2]++;
            else if(c=='o')
                a[3]++;
            else if(c=='n')
                a[4]++;
        }
        a[2]/=2;
        a[3]/=2;
        int min=a[0];
        for(int i=0;i<5;i++)
            if(a[i]<min)
                min=a[i];
        return min;
    }
}