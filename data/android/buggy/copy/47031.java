@java.lang.Override
protected void onPause() {
    super.onPause();
    onActivityResult(0, org.deviceconnect.android.manager.RESULT_CANCELED, null);
    if (mIsBind) {
        unbindService(mServiceConnection);
        mIsBind = false;
    }
    finish();
}