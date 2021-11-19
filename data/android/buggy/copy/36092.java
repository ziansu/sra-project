@java.lang.Override
public void close() throws java.io.IOException {
    input.close();
    memCache.release(buffer);
    input = null;
}