public void onResume() {
    getView().showLoading();
    getView().showServerName(mRemoteFileListInteracor.getServerName());
    mRemoteFileListInteracor.getRemoteFileList();
    mRemoteFileListInteracor.registerCallback(mFtpUploadCallback);
}