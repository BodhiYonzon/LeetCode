class NumMatrix {
    int[][]a;
    public NumMatrix(int[][] matrix) {
        this.a=matrix;
        getpsum();
    }
    void getpsum(){
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a[0].length;j++){
                a[i][j]+=a[i][j-1];
            }
        }
        for(int i=1;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]+=a[i-1][j];
            }
        }
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans=a[row2][col2];
        if(row1!=0){
            ans-=a[row1-1][col2];
            if(col1!=0)
                ans+=a[row1-1][col1-1];
        }
        if(col1!=0)
            ans-=a[row2][col1-1];
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */