public synchronized void start() {
    if (running) {
        throw new java.lang.IllegalStateException("Database is already running");
    }
    thread = new java.lang.Thread(this, "Database");
    running = true;
    thread.run();
}