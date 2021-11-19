public void stopThread() {
    pausePlay(true);
    mRunning = false;
    synchronized(this) {
        this.interrupt();
    }
}