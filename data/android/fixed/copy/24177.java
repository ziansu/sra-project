public synchronized boolean waitIfNeed() throws java.lang.InterruptedException {
    if ((size()) == 0) {
        wait();
        return true;
    }else {
        return false;
    }
}