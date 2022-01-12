@java.lang.Override
protected void onStop() {
    super.onStop();
    if (mConnection.isBound()) {
        unbindService(mConnection);
    }
}