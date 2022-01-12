public void attendiEndAll() throws java.lang.InterruptedException {
    concurrent.LockManager.lockEndAll.lock();
    while (concurrent.LockManager.inAttesaEndAll) {
        concurrent.LockManager.conditionEndAll.await();
    } 
    concurrent.LockManager.lockEndAll.unlock();
}