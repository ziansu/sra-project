@java.lang.Override
public void run() {
    mBluetoothLeService.connect(mDeviceAddress);
    mHandler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (isConnecting()) {
                handleConnectFail();
            }
        }
    }, com.wm.bloodpro_4_0.MainActivity.CONNECT_TIME);
}