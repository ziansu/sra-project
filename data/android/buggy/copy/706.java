public void put(java.lang.Object element) {
    if ((writePos) == (capacity)) {
        writePos = 0;
    }
    elements[writePos] = element;
    (writePos)++;
    (available)++;
}