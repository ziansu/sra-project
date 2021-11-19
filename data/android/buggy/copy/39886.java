@java.lang.Override
public void close() throws java.io.IOException {
    try {
        in.close();
        fireAllDataRead();
    } catch (final java.io.IOException ex) {
        fireError(ex);
        throw ex;
    }
}