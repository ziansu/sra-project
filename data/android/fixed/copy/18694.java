@java.lang.Override
public void onDestroy() {
    dispatcher.stop();
    unbindService(mServiceConnection);
    mBluetoothLeService = null;
    super.onDestroy();
}