@java.lang.Override
public void run() {
    log.debug("Scheduler invoked");
    if (executor.isShutdown()) {
        log.info("Scheduler is shutting down");
        return ;
    }
    pollDynamicConfigIfNeeded();
    publishCodeBaseIfNeeded();
    publishInvocationDataIfNeeded();
}