@java.lang.Override
protected void stopUpdates() {
    mIsActive = false;
    synchronized(thread) {
        thread.notifyAll();
    }
}