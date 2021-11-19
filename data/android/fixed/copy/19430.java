protected void finalize() throws java.lang.Throwable {
    try {
        release();
    } finally {
        super.finalize();
    }
}