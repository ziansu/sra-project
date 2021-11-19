private void loadCurrentList() {
    list = amrabed.android.release.evaluation.core.ActivityList.getCurrent();
    if (list.isEmpty()) {
        loadDefaultList();
    }
}