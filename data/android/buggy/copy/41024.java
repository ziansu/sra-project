public boolean isClosed() {
    synchronized(task) {
        return this.server.isClosed();
    }
}