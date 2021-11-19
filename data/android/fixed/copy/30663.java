@java.lang.Override
public synchronized void close() throws java.io.IOException {
    destroyWriter(path);
    super.close();
}