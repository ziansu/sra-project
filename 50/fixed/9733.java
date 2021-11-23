public void start() {
    checkingThread.start();
    if (isMaster) {
        resourceManagerReadThread.start();
    }
}