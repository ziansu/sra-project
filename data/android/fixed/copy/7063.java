public void clearLastMessage() {
    synchronized(lock) {
        waitForMessage();
        messages.remove(0);
        senders.remove(0);
    }
}