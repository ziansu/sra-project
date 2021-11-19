@java.lang.Override
protected void finalize() throws java.io.IOException, java.lang.Throwable {
    try {
        if ((!(closed)) && ((raf) != null)) {
            close();
        }
    } finally {
        super.finalize();
    }
}