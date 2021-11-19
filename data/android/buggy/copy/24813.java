protected void finalize() {
    if ((_handle) != 0)
        com.couchbase.cbforest.DocumentIterator.free(_handle);
    
}