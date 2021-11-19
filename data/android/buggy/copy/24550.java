public void start() {
    mProgress = 0.0F;
    mToolbar.setLoadProgress(mProgress);
    mToolbar.startLoadProgress();
    mHandler.sendEmptyMessage(org.chromium.chrome.browser.toolbar.ToolbarManager.LoadProgressSimulator.MSG_ID_UPDATE_PROGRESS);
}