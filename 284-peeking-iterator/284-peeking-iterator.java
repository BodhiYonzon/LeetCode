// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer>iterator,it2;
    List<Integer>list;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator=iterator;
        this.list=new ArrayList<>();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(list.size()!=0)
            return list.get(0);
        else{
            Integer x=iterator.next();
            list.add(x);
            return x;
        }
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        if(list.size()!=0){
            Integer x=list.get(0);
            list.remove(0);
            return x;
        }
        return iterator.next();
	}
	
	@Override
	public boolean hasNext() {
	    return list.size()>0||iterator.hasNext();
	}
}