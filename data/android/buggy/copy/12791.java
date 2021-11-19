@java.lang.Override
public T next() {
    T next = null;
    if (hasNext()) {
        next = current.getNext().getValue();
        current = current.getNext();
    }
    return next;
}