public void insertOrIgnore(java.lang.Object object) {
    writeLock.lock();
    try {
        bindInsertStatementArgs(object);
        insertOrIgnoreStatement.execute();
    } finally {
        writeLock.unlock();
    }
}