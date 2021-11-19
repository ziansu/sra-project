@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    com.alejandro_castilla.cloudfitforwear.services.bluetooth.BluetoothService.BluetoothServiceBinder bluetoothServiceBinder = ((com.alejandro_castilla.cloudfitforwear.services.bluetooth.BluetoothService.BluetoothServiceBinder) (service));
    com.alejandro_castilla.cloudfitforwear.services.bluetooth.BluetoothService bluetoothService = bluetoothServiceBinder.getService();
    bluetoothService.findBluetoothDevice("C8:3E:99:0D:DD:43");
}