@java.lang.Override
public void onSuccess(int syncedFiles) {
    avFragment.reloadData();
    if (syncedFiles > 0) {
        showToast(java.lang.String.format("%d files synced", syncedFiles));
    }
    avFragment.showProgress(false);
}