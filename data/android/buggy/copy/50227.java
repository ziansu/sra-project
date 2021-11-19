@java.lang.Override
public void run() {
    browserPanel.init();
    browserPanel.initScheduledJobs(scheduledThreadPoolExecutor);
    rssLogic.init();
    rssLogic.initScheduledJobs(scheduledThreadPoolExecutor);
}