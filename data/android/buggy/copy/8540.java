@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mConnectedThread) != null)
        mConnectedThread.cancel();
    
}