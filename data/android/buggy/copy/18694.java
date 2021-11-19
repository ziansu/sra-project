@java.lang.Override
public void onDestroy() {
    unbindService(mServiceConnection);
    mBluetoothLeService = null;
    dispatcher.stop();
    super.onDestroy();
}