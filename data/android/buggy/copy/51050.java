@java.lang.Override
public T next() {
    if ((ptr) != null) {
        T val = ((T) (ptr.contents));
        if (hasNext())
            ptr = ptr.next;
        
    }
    return val;
}