@java.lang.Override
public void run() {
    com.okandroid.boot.widget.PageDataAdapter.ExtraPageLoadingStatusCallback safetyCallback = callback;
    if (safetyCallback == null) {
        safetyCallback = new com.okandroid.boot.widget.PageDataAdapter.SimpleExtraPageLoadingStatusCallback();
        ensurePageLoadingStatusHandler();
        mPageLoadingStatusHandler.showPageLoadingStatus(this, pageLoadingStatus, safetyCallback);
    }
}