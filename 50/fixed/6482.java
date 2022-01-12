@java.lang.Override
public void moveTask(com.druger.refresher.models.ModelTask task) {
    alarmHelper.removeAlarm(task.getTimeStamp());
    if ((onTaskDoneListener) != null) {
        onTaskDoneListener.onTaskDone(task);
    }
}