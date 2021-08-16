package main;

public interface Interator<T> {

    public boolean hasNext();

    public T next();

    public void reset();
}
