@java.lang.Override
public void onTaskViewDismissed(com.android.systemui.recents.model.Task t) {
    com.android.systemui.recents.model.RecentsTaskLoader loader = com.android.systemui.recents.model.RecentsTaskLoader.getInstance();
    loader.deleteTaskData(t, false);
    loader.getSystemServicesProxy().removeTask(t.key.id);
}