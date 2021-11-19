public void pending() throws lockmgr.DeadlockException {
    try {
        waitingThread.wait(LockManager.DEADLOCK_TIMEOUT);
        throw new lockmgr.DeadlockException(tid, "Sleep timeout...deadlock.");
    } catch (java.lang.InterruptedException ignored) {
    }
}