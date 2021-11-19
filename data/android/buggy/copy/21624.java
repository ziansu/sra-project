@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mConnectedThread) != null) {
        mConnectedThread.write("2");
        mConnectedThread.interrupt();
    }
    stopBluetoothReader();
}