@java.lang.Override
public void onSuccess(java.io.File file) {
    mDownloadDialog.dismiss();
    if ((onDownloadListener) != null) {
        onDownloadListener.onSuccess(file);
    }
}