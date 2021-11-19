public void maximize(final java.lang.Integer activityClass) {
    saveLayout();
    for (com.zst.xposed.halo.floatingwindow3.tasks.WindowHolder mWindowHolder : activitiesStack.get(activityClass)) {
        if (mWindowHolder != null) {
            mWindowHolder.setMaximized();
            mWindowHolder.pushToWindow();
        }
    }
}