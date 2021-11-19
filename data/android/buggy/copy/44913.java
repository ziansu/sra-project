public void clear() {
    unschedule();
    inbox.clear();
    synchronized(inbox) {
        inbox.notify();
    }
}