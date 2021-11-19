public synchronized boolean isOpened() {
    return ((fd) >= 0) && ((pid) >= 0);
}