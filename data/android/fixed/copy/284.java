@java.lang.Override
public void start() {
    if (isStarted.compareAndSet(false, true)) {
        super.start();
        initCacheSyncTask();
    }
}