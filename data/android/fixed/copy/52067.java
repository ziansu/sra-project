public void close() {
    simpledb.Database.getBufferPool().releasePage(tid, pid);
    tuples = null;
    pid = null;
}