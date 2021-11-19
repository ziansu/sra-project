@java.lang.Override
public synchronized void close() {
    closed = true;
    wire.clear();
}