public void createVolatileScheduler(int maxThreads) throws org.quartz.SchedulerException {
    org.quartz.simpl.SimpleThreadPool threadPool = new org.quartz.simpl.SimpleThreadPool(maxThreads, java.lang.Thread.NORM_PRIORITY);
    threadPool.initialize();
    org.quartz.spi.JobStore jobStore = new org.quartz.simpl.RAMJobStore();
    this.createScheduler(threadPool, jobStore);
}