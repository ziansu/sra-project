@java.lang.Override
public E removeLast() {
    if (!(isEmpty())) {
        E temp = array[(--(currentSize))];
        dynamicResize(false);
        return temp;
    }
    return null;
}