@java.lang.Override
public void onStart() {
    super.onStart();
    java.lang.String pairedList = "PairedList: \n";
    pairedDevices = mBluetoothAdapter.getBondedDevices();
    ConnectThread = new com.example.michaelwong.paireddevice.MainActivity.ConnectThread();
    ConnectThread.start();
}