@java.lang.Override
public synchronized void close() throws java.io.IOException {
    super.close();
    destroyWriter(path);
}