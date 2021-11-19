public void quit() {
    quit = true;
    synchronized(syncThread) {
        syncThread.notify();
    }
}