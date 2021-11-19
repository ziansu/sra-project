private void initLocks() {
    for (int i = 0; i < (locks.length); i++)
        this.locks[i] = new java.util.concurrent.locks.ReentrantReadWriteLock();
    
}