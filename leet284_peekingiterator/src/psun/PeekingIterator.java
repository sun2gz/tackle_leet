package psun;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Iterator;

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {

    private Integer cache;

    private Iterator<Integer> iterator;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;

        if (this.iterator.hasNext()) {
            cache = iterator.next();
        }
        else {
            cache = null;
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return cache;

    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer temp = this.cache;

        if (this.iterator.hasNext())
        {
            this.cache=this.iterator.next();
        }
        else {
            this.cache = null;
        }

        return temp;
    }

   @Override
    public boolean hasNext() {
        return (this.cache!=null);
    }

    @Override
    public void remove() {
        throw new NotImplementedException();
    }

}