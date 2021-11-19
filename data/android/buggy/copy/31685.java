@java.lang.Override
public void close() {
    this.closed = true;
    cache.closeWrite();
}