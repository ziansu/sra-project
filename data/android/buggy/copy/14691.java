public void rebuildTables() {
    commitAndRollbackLock.writeLock().lock();
    try {
        moreDBSchema.rebuildTables(false);
        moreDBSchema.updateTransactionsTable(0, 0);
    } finally {
        commitAndRollbackLock.writeLock().unlock();
    }
}