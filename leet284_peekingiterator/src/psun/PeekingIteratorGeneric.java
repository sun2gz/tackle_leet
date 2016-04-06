package psun;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Iterator;

/**
 * Created by psun on 4/5/16.
 */
public class PeekingIteratorGeneric<T> implements Iterator<T> {

    private T cache;

    private Iterator<T> iterator;

    public PeekingIteratorGeneric(Iterator<T> iterator) {
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
    public T peek() {
        return cache;

    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public T next() {
        T temp = this.cache;

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