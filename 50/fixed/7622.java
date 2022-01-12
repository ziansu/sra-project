public final void addCleanupTask(final java.lang.Runnable cleanupTask) {
    synchronized(this.cleanupTasks) {
        this.cleanupTasks.add(cleanupTask);
    }
}