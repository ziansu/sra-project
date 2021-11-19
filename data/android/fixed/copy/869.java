private void send(java.lang.String data) {
    message = data;
    synchronized(this) {
        notify();
    }
}