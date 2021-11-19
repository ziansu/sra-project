public synchronized void destroy() {
    this.disconnect();
    consumerThread.interrupt();
}