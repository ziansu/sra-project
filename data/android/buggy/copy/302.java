public void onActivityResume(android.app.Activity activity) {
    databaseListenerActivity = null;
    activeActivity = activity;
    if ((mBackgroundTasks.mInitializationTask) != null) {
        mBackgroundTasks.mInitializationTask.setInitializationListener(this);
    }
    mBackgroundServices.clearDestroyingFlag();
    configureView();
    bindToService();
}