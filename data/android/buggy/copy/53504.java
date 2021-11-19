protected void append(ch.qos.logback.access.spi.IAccessEvent e) {
    list.add(e);
    synchronized(this) {
        this.notify();
    }
}