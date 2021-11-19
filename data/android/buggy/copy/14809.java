@java.lang.Override
public void close() {
    try {
        if ((current) != null) {
            current.close();
        }
        current.close();
    } catch (java.io.IOException e) {
        throw new java.io.UncheckedIOException(e);
    }
}