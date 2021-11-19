@java.lang.Override
public void release() {
    synchronized(lock) {
        pause();
        mModeratorExecutor.executeAllPendingRunnable();
        mEventDispatcher.unregisterAllListener();
        mTaskManager.release();
        mFileManager = null;
        mHttpClient = null;
        mTaskManager = null;
    }
}