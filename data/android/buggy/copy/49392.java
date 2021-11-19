@java.lang.Override
public void flushBuffer() throws java.io.IOException {
    try {
        response.flushBuffer();
    } catch (java.io.IOException ex) {
        handleException(ex);
        throw ex;
    }
}