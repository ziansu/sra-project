@java.lang.Override
public synchronized void reset() throws java.io.IOException {
    try {
        in.reset();
    } catch (final java.io.IOException ex) {
        fireError(ex);
        throw ex;
    }
}