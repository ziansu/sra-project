public synchronized void start() {
    java.lang.Thread thread = new java.lang.Thread(this, "main");
    thread.start();
}