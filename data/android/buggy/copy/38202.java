@java.lang.Override
public void activate() {
    java.util.concurrent.locks.Lock l = this.hashlock.writeLock();
    l.lock();
    this.lastFound.set(java.lang.System.currentTimeMillis());
    this.active = true;
    l.unlock();
}