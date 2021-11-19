public void addPostDrawTask(final java.lang.Runnable runnable) {
    synchronized(mPreDrawTaskList) {
        mPostDrawTaskList.addLast(runnable);
    }
}