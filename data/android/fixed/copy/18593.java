public void pauseThread() throws java.lang.InterruptedException {
    synchronized(this) {
        wait();
    }
}