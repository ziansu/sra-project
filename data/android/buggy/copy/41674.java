@java.lang.Override
public void onCreate() {
    btManager = null;
    mBluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    if ((mBluetoothAdapter) == null) {
        java.lang.System.exit(0);
    }
    smokinoGUI = null;
    super.onCreate();
}