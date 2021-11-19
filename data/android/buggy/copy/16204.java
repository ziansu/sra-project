@java.lang.Override
public void run() {
    if (!(mIsStartService.get())) {
        java.lang.String err = "service not found force disconnect";
        android.util.Log.e(com.billin.www.rxble.ble.originV2.BluetoothLeConnector.TAG, err);
        gatt.disconnect();
        mOnConnectListener.onError(err);
    }
}