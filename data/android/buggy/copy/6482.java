@java.lang.Override
public void moveTask(com.druger.refresher.models.ModelTask task) {
    alarmHelper.removeAlarm(task.getTimeStamp());
    onTaskDoneListener.onTaskDone(task);
}