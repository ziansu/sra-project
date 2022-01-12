@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    unregisterReceiver(mMyReceiver);
    unregisterReceiver(mSecondReceiver);
    if ((mLocalBroadcastManager) != null) {
        mLocalBroadcastManager.unregisterReceiver(mThirdReceiver);
    }
}