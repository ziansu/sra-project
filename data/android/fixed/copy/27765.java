public static void unBindService() {
    if ((com.bytereal.byterealblesdk.broadcast.receiver.BluetoothBroadcastReceiver.context) != null) {
        android.content.Intent stopIntent = new android.content.Intent(com.bytereal.byterealblesdk.broadcast.receiver.BluetoothBroadcastReceiver.context, com.bytereal.byterealblesdk.service.IBeaconScanService.class);
        com.bytereal.byterealblesdk.broadcast.receiver.BluetoothBroadcastReceiver.context.stopService(stopIntent);
    }
}