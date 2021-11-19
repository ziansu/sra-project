@java.lang.Override
public E previous() {
    if (hasPrevious())
        current = current.prev;
    
    throw new java.util.NoSuchElementException();
}