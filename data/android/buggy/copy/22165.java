@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    mSyncSubscription.unsubscribe();
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(mRefreshReceiver);
}