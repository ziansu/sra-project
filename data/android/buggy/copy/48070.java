@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String action = intent.getAction();
    if (action.equals(BluetoothAdapter.ACTION_LOCAL_NAME_CHANGED)) {
        updateDeviceName();
    }
}