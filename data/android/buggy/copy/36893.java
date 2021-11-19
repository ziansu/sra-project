@java.lang.Override
protected void onDestroy() {
    if ((mAdView) != null) {
        mAdView.destroy();
    }
    super.onDestroy();
    stop();
}