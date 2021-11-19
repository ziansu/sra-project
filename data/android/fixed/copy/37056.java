public void doneSeeding() {
    try {
        lock.lock();
        ++(numSeededHoles);
        --(numUnseededHoles);
        readyToFill.signal();
    } finally {
        lock.unlock();
    }
}