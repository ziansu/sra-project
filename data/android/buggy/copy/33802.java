@java.lang.Deprecated
public static synchronized org.empyrn.darkknight.bluetooth.BluetoothGameController getLastInstance(android.content.Context context) {
    if ((org.empyrn.darkknight.bluetooth.BluetoothGameController.mLastInstance) == null) {
        org.empyrn.darkknight.bluetooth.BluetoothGameController.mLastInstance = new org.empyrn.darkknight.bluetooth.BluetoothGameController(context);
        org.empyrn.darkknight.bluetooth.BluetoothGameController.mLastInstance.setDiscoverable(context);
    }
    return org.empyrn.darkknight.bluetooth.BluetoothGameController.mLastInstance;
}