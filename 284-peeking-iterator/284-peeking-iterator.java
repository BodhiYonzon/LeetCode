// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iterator;
    Integer peek;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator=iterator;
        this.peek=0;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(peek>0)
            return peek;
        peek=iterator.next();
        return peek;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(peek>0){
            Integer temp=peek;
            peek=0;
            return temp;
        }
        return iterator.next();
	}
	
	@Override
	public boolean hasNext() {
        return peek>0||iterator.hasNext();
	}
}