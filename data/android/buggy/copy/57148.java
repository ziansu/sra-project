@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    uni_spacestudio.blueconsole.BluetoothCommService.BluetoothCommBinder binder = ((uni_spacestudio.blueconsole.BluetoothCommService.BluetoothCommBinder) (service));
    bluetoothService = binder.getService();
    binder.setHandler(bluetoothCommHandler);
}