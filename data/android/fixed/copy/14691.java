public void rebuildTables() {
    commitAndRollbackLock.writeLock().lock();
    try {
        moreDBSchema.rebuildTables(true);
        moreDBSchema.updateTransactionsTable(0, 0);
    } finally {
        commitAndRollbackLock.writeLock().unlock();
    }
}