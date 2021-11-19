@java.lang.Override
public java.util.Iterator<T> iterator() {
    return new org.cactoos.list.LimitedIterator(iterable.iterator(), limit);
}