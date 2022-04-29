class Solution {
    public boolean isBipartite(int[][] graph) {
        Set<Integer>set=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        for(int i=0;i<graph.length;i++){
            if(!set.contains(i)){
                for(int j:graph[i]){
                    if(set2.contains(j)){
                        set.add(i);
                        for(int k:graph[i])
                            set2.add(k);
                    }
                }
                if(set.contains(i))
                    continue;
                for(int j:graph[i]){
                    set.add(j);
                    for(int k:graph[j])
                        set2.add(k);
                }
                set2.add(i);
            }
        }
        for(int i:set){
            if(set2.contains(i))
                return false;
            set2.remove(i);
        }
        for(int i:set2){
            if(set.contains(i))
                return false;
        }
        return true;
    }
}