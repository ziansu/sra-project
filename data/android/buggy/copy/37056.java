public void doneSeeding() {
    try {
        lock.lock();
        totalHolesSeeded.getAndIncrement();
        ++(numSeededHoles);
        --(numUnseededHoles);
        readyToFill.signal();
    } finally {
        lock.unlock();
    }
}