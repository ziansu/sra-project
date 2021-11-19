public synchronized void waitForSignal() throws java.lang.InterruptedException {
    if (!(signalled)) {
        wait();
    }
}