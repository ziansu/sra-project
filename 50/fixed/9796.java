@java.lang.Override
public E previous() {
    if (hasPrevious())
        current = current.prev;
    else
        throw new java.util.NoSuchElementException();
    
    return ((E) (current.data));
}