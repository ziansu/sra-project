@java.lang.Override
public void close() {
    cache.closeRead();
    closed = true;
}