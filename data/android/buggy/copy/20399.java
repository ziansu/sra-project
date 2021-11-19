@java.lang.Override
public void close() {
    synchronized(this) {
        this.closed = true;
        this.needsFetch = false;
    }
    this.queue.clear();
}