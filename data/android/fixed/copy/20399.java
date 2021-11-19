@java.lang.Override
public void close() {
    synchronized(this) {
        this.closed = true;
    }
    this.queue.clear();
}