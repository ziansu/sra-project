@java.lang.Override
public synchronized void clear() {
    while ((queue.poll()) != null);
}