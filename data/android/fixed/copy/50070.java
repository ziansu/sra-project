@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    unbindService(mServiceConnection);
    mBluetoothLeService = null;
    if ((mAccLis) != null)
        mSensorManager.unregisterListener(mAccLis);
    
}