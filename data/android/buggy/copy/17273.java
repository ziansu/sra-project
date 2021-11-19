@java.lang.Override
public void forkSpecifiedCallLog(android.content.Context context, com.pioneer.aaron.dolly.fork.calllog.ForkCallLogData data) {
    if ((mForkBinder) != null) {
        mForkBinder.startFork(ForkTask.FORK_TYPE_SPECIFIED_CALLLOGS, data.getQuantity(), data);
        toastForkTask(context);
    }
}