@java.lang.Override
protected void onCancelled() {
    super.onCancelled();
    synchronized(mPauseWorkLock) {
        mPauseWorkLock.notifyAll();
    }
}