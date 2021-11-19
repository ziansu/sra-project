public void disconnect() {
    synchronized(this) {
        worker.sendQuit();
        theClient.quit();
    }
}