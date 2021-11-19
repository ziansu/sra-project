public void commitOrRollbackIfNeeded() {
    if (((counter) % (commitModulo)) == (commitModulo)) {
        commitAndStartNewTransaction();
    }
}