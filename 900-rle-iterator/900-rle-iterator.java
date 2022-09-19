class RLEIterator {
    int a[];
    long in;
    public RLEIterator(int[] encoding) {
        this.a=encoding;
        this.in=0;
    }
    
    public int next(int no) {
        in+=no;
        long n=in;
        for(int i=0;i<a.length;i+=2){
            if(a[i]>=n)
                return a[i+1];
            n-=a[i];
        }
        return -1;
    }
}

/**
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(encoding);
 * int param_1 = obj.next(n);
 */