public void onDownloadFail(java.lang.String message) {
    closeLoadingDialog();
    submitButton.setText(R.string.finish);
    showMessage(R.string.download_fail_message);
}