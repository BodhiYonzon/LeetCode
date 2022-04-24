class UndergroundSystem {
    Map<Integer,Pair<String,Integer>> checkin;
    Map<String,int[]> map;
    public UndergroundSystem() {
        map=new HashMap<>();
        checkin=new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkin.put(id,new Pair(stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String,Integer> pair=checkin.get(id);
        checkin.remove(id);
        String s="s="+pair.getKey()+"e="+stationName;
        map.putIfAbsent(s,new int[2]);
        int x[]=map.get(s);
        x[0]+=t-pair.getValue();
        x[1]++;
        
    }
    
    public double getAverageTime(String startStation, String endStation) {
        int a[]=map.get("s="+startStation+"e="+endStation);
        return (double)a[0]/a[1];
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */