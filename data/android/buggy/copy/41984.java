@java.lang.Override
public E peek() {
    if ((currentSize) == 0) {
        return null;
    }
    return items[takeIndex];
}