@java.lang.Override
public void onSuccess(java.io.File file) {
    mDownloadDialog.dismiss();
    onDownloadListener.onSuccess(file);
}