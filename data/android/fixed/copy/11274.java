public void onResume() {
    super.onResume();
    getView().showLoading();
    mRemoteFileListInteracor.getRemoteFileList();
    mRemoteFileListInteracor.registerCallback(mFtpUploadCallback);
}