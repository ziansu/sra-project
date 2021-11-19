@java.lang.Override
public void onLeScan(final android.bluetooth.BluetoothDevice device, final int rssi, byte[] scanRecord) {
    activity.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            addDevice(device, rssi);
        }
    });
}