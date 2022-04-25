// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iterator;
    boolean peek;
    Integer temp;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator=iterator;
        this.peek=false;
        this.temp=0;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(peek)
            return temp;
        temp=iterator.next();
        peek=true;
        return temp;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(peek){
            peek=false;
            return temp;
        }
        return iterator.next();
	}
	
	@Override
	public boolean hasNext() {
        return peek||iterator.hasNext();
	}
}