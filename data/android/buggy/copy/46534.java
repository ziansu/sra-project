@java.lang.Override
public void onClick(android.view.View v) {
    if (!(isConnected)) {
        bluetoothHandler.scanLeDevice(true);
    }else {
        killService();
        unbindService(myConnection);
    }
}