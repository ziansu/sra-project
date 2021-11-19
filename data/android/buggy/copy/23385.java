@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mConnectedThread) != null) {
        mConnectedThread.write("+COMMAND:1\n");
        mConnectedThread.write("+COMMAND:3\n");
        mConnectedThread.interrupt();
    }
    stopBluetoothReader();
}