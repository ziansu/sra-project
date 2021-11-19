@java.lang.Override
public synchronized void clear() {
    while ((poll()) != null);
}