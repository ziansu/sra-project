public void requestLowPriority() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        mBluetoothGatt.requestConnectionPriority(BluetoothGatt.CONNECTION_PRIORITY_LOW_POWER);
    }
}