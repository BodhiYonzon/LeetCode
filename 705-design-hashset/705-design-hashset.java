class MyHashSet {
    Set<Integer> hash;
    public MyHashSet() {
        hash=new HashSet<>();
    }
    
    public void add(int key) {
        hash.add(key);
    }
    
    public void remove(int key) {
        hash.remove(key);
    }
    
    public boolean contains(int key) {
        return hash.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */