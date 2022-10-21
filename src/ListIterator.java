package src;
import java.util.Iterator;

public abstract class ListIterator {

    @SuppressWarnings("rawtypes")
    public abstract boolean HasNext(Iterator iterator);

    @SuppressWarnings("rawtypes")
    public abstract void MoveToHead(Iterator iterator);

    @SuppressWarnings("rawtypes")
    public abstract String Next(Iterator iterator);

    @SuppressWarnings("rawtypes")
    public abstract void Remove(Iterator iterator);

}