@java.lang.Override
public void close() throws java.io.IOException {
    closed.set(true);
    if ((randomAccessFile.get()) != null) {
        randomAccessFile.get().close();
    }
}