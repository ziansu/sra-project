@java.lang.Override
public synchronized void close() {
    closed = true;
    synchronized(wire) {
        wire.clear();
    }
}