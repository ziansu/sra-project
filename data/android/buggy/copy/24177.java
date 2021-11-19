public synchronized void waitIfNeed() throws java.lang.InterruptedException {
    if ((size()) == 0) {
        wait();
    }
}