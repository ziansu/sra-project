public void attendiSette() throws java.lang.InterruptedException {
    concurrent.LockManager.lockSette.lock();
    while (concurrent.LockManager.inAttesaSette) {
        concurrent.LockManager.conditionSette.await();
    } 
    concurrent.LockManager.inAttesaSette = true;
    concurrent.LockManager.lockSette.unlock();
}