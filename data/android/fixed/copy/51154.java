public void attendiTredici() throws java.lang.InterruptedException {
    concurrent.LockManager.lockTredici.lock();
    while (concurrent.LockManager.inAttesaZero) {
        concurrent.LockManager.conditionTredici.await();
    } 
    concurrent.LockManager.inAttesaTredici = true;
    concurrent.LockManager.lockTredici.unlock();
}