private synchronized void wakeUp() {
    if (!(wakeUp)) {
        this.wakeUp = true;
        this.interrupt();
    }
}