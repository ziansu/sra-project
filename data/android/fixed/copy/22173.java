public synchronized void start() {
    if (this.isRunning) {
        return ;
    }
    isRunning = true;
    thread = new java.lang.Thread(this);
    thread.start();
}