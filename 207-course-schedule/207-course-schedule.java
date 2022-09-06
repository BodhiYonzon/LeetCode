class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> []a=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            a[i]=new ArrayList<>();
        }
        for(int i[]:prerequisites){
            a[i[0]].add(i[1]);
        }
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<numCourses;i++){
            q.add(i);
        }
        int n=0;
        while(q.size()!=0){
            if(n==q.size())
                break;
            int temp=q.poll();
            List<Integer> temp2=new ArrayList<Integer>();
            temp2.addAll(a[temp]);
            for(int x:temp2){
                if(set.contains(x)){
                    a[temp].remove((Integer)x);
                }
            }
            if(a[temp].size()==0){
                n=0;
                set.add(temp);
            }
            else{
                n++;
                q.add(temp);
            }
        }
        return q.size()==0;
    }
}