public void close() {
    java.lang.System.out.println("closing server connection");
    synchronized(this) {
        this.notifyAll();
    }
}