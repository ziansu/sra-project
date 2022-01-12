public void quit() {
    synchronized(syncThread) {
        quit = true;
        syncThread.notify();
    }
}