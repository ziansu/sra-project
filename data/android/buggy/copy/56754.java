@java.lang.Override
public E removeFirst() {
    if ((currentSize) != 0) {
        E temp = array[0];
        (currentSize)--;
        dynamicResize(false);
        shiftElements(0, false);
        return temp;
    }
    return null;
}