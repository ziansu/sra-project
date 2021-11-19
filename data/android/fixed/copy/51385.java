public void onDownloadFail(java.lang.String message) {
    closeLoadingDialog();
    showMessage(R.string.download_fail_message);
}