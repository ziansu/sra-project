@java.lang.Override
public void onClick(android.view.View v) {
    if ((currentTask) != null) {
        stopTask(activity);
    }else {
        startTask(activity);
    }
}