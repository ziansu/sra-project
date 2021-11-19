@java.lang.Override
public void remove() {
    if (previous.equals(position))
        throw new java.lang.IllegalStateException();
    
    if (position.equals(first))
        removeFirst();
    else
        previous.next = position.next;
    
    position = previous;
}