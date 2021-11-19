public void unwind() {
    if (!(evictSyncAgr))
        return ;
    
    if (!(enterBusy()))
        return ;
    
    try {
        checkEvictionQueue();
    } finally {
        busyLock.leaveBusy();
    }
}