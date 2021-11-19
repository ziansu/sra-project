public synchronized void shutdown() {
    isGone = false;
    notifyAll();
}