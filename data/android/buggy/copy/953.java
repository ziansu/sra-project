public void stopThread() {
    isRunning = false;
    java.lang.Thread t = thread;
    thread = null;
    t.interrupt();
}