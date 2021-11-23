private void checkIndexBoundsForNewElements(int index) {
    if (!((0 <= index) && (index <= (size)))) {
        throw new java.lang.IndexOutOfBoundsException();
    }
}