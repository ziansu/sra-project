@java.lang.Override
public boolean cancel(boolean mayInterruptIfRunning) {
    if ((cronTaskId) == null) {
        throw new java.lang.IllegalArgumentException("Can't cancel a task without a cron task ID");
    }
    cronScheduler.deschedule(cronTaskId);
    cancelled = true;
    return isCancelled();
}