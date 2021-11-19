protected void ensureValidIndex(int index) {
    if (index >= (size())) {
        throw new java.lang.IndexOutOfBoundsException();
    }
}