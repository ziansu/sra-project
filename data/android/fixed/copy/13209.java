@java.lang.Override
public void addSchedulerListener(java.lang.String targetName, com.arialyy.aria.core.scheduler.ISchedulerListener<TASK> schedulerListener) {
    mSchedulerListeners.put(targetName, schedulerListener);
}