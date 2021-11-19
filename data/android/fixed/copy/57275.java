@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((mNfcAdapter) != null) {
        org.smap.smapTask.android.activities.MainTabsActivity.stopNFCDispatch(this, mNfcAdapter);
    }
    if (listenerRegistered) {
        unregisterReceiver(listener);
        listenerRegistered = false;
    }
}