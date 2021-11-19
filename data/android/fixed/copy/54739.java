@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    android.util.Log.v(leoliang.runningcadence.BackgroundService.LOG_TAG, "onUnbind'd");
    clientHandler = null;
    return true;
}