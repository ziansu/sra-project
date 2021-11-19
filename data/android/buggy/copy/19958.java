public boolean resizeDisk(long newSize) {
    if (newSize < (currSize)) {
        return false;
    }
    maxSize = newSize;
    return true;
}