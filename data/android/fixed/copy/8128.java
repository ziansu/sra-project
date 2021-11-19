private void ensureClose(java.io.Closeable c) {
    try {
        if (c != null)
            c.close();
        
    } catch (java.io.IOException e) {
    }
}