protected void finalize() throws java.lang.Throwable {
    try {
        if ((mServiceConnection) != null)
            release();
        
    } finally {
        super.finalize();
    }
}