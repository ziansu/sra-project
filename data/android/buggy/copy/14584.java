public int count() {
    synchronized(inbox) {
        return inbox.size();
    }
}