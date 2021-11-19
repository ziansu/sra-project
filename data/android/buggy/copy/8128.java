private void ensureClose(java.io.Closeable c) {
    try {
        c.close();
    } catch (java.io.IOException e) {
    }
}