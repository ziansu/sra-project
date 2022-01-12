public void put(java.lang.Object element) {
    elements[writePos] = element;
    (writePos)++;
    (available)++;
    if ((writePos) == (capacity)) {
        writePos = 0;
    }
}