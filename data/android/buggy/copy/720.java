@java.lang.Override
protected void onStop() {
    super.onStop();
    updatingValues = false;
    if (mBound) {
        unbindService(mConnection);
        mBound = false;
    }
}