@java.lang.Override
public void execute(java.lang.Runnable runnable) {
    tasks.add(runnable);
    synchronized(lock) {
        lock.notify();
    }
}