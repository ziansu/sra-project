@java.lang.Override
public boolean hasNext() {
    if (!(iterator.hasNext())) {
        iterator = iterable.iterator();
    }
    return iterator.hasNext();
}