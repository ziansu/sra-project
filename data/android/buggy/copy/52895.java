void scanningDone() {
    waitResultLock.lock();
    isRunning.set(false);
    waitForResult.signalAll();
    waitResultLock.unlock();
}