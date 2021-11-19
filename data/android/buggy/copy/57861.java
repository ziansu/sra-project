@java.lang.Override
public void onCompleted() {
    mForkTask = null;
    stopForeground(true);
    getNotificationManager().notify(1, getNotification(getResources().getString(R.string.fork_task_completed), (-1)));
}