private void checkRange(int index) {
    if ((index < 0) || (index > (elementData.length))) {
        throw new java.lang.IndexOutOfBoundsException();
    }
}