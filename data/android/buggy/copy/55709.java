public void onStop(android.view.View view) {
    if (mBound) {
        unbindService(mConnection);
        mBound = false;
    }
}