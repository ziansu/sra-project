@java.lang.Override
public void writeUnlock() {
    long lockTime = (this.lockStart) - (java.lang.System.nanoTime());
    this.fsLock.writeLock().unlock();
    writeLockStat.addValue(lockTime);
}