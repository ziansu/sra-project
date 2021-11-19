protected void finalize() throws java.lang.Throwable {
    try {
        if ((_handle) != 0)
            com.couchbase.cbforest.DocumentIterator.free(_handle);
        
    } finally {
        super.finalize();
    }
}