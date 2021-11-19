public void syncAllWindows(final java.lang.String activityClass) {
    for (com.zst.xposed.halo.floatingwindow3.tasks.WindowHolder mWindowHolder : activitiesStack.get(activityClass)) {
        mWindowHolder.pushToWindow();
    }
}