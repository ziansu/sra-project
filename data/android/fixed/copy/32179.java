public void run() {
    android.bluetooth.BluetoothSocket cSocket = null;
    try {
        cSocket = mmSSocket.accept();
    } catch (java.io.IOException e) {
        return ;
    }
    onConnected(cSocket);
}