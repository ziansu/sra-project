@java.lang.Override
public void close() throws java.io.IOException {
    currentBuffer = null;
    buffers = null;
    markers = null;
}