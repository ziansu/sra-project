public synchronized void stop() {
    try {
        this.isRunning = false;
        thread.join();
    } catch (java.lang.InterruptedException ex) {
        ex.printStackTrace();
    }
}