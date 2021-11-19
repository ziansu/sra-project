@java.lang.Override
protected void onDestroy() {
    if ((mAdView) != null) {
        mAdView.destroy();
    }
    if ((myBilling) != null) {
        myBilling.onDestroy();
    }
    super.onDestroy();
}