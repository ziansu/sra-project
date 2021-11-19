private void cancelBrowseToTask() {
    if ((browseToTask) != null) {
        android.util.Log.d(de.qabel.qabelbox.fragments.FilesFragment.TAG, "Found a running browseToTask");
        browseToTask.cancel(true);
        browseToTask = null;
        android.util.Log.d(de.qabel.qabelbox.fragments.FilesFragment.TAG, "Canceled browserToTask");
    }
}