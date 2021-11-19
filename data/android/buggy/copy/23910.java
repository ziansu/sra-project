@java.lang.Override
public void destroy() {
    com.sun.identity.common.ShutdownManager manager = com.sun.identity.common.ShutdownManager.getInstance();
    if (manager.acquireValidLock()) {
        try {
            manager.shutdown();
        } finally {
            manager.releaseLockAndNotify();
        }
    }
    super.destroy();
}