@java.lang.Override
protected void startUp() throws java.lang.Exception {
    co.cask.cdap.internal.app.services.ProgramLifecycleService.LOG.info("Starting ProgramLifecycleService");
    scheduledExecutorService.scheduleWithFixedDelay(new co.cask.cdap.internal.app.services.ProgramLifecycleService.RunRecordsCorrectorRunnable(this, store, runtimeService), 2L, 600L, java.util.concurrent.TimeUnit.SECONDS);
}