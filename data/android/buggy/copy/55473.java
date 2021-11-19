public boolean disconnect() {
    thread.cancel();
    myThreadConnected.cancel();
    return true;
}