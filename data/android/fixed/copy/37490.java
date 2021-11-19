@java.lang.Override
public synchronized void onResume() {
    super.onResume();
    registerReceiver(mPairReceiver, new android.content.IntentFilter(android.bluetooth.BluetoothDevice.ACTION_BOND_STATE_CHANGED));
    mApp.resumeComm();
    mApp.mDeviceActivityVisible = true;
}