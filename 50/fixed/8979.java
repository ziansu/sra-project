@java.lang.Override
public T set(int index, T element) {
    if ((index < 0) || (index >= (size))) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    dataArray[index] = element;
    return element;
}