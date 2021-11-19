@java.lang.Override
public void onResume() {
    super.onResume();
    registerReceiver(rfduinoReceiver, com.sealbluetoothtoothpasteapp.RFduinoService.getIntentFilter());
}