public void run() {
    android.bluetooth.BluetoothSocket cSocket = null;
    try {
        cSocket = mmSSocket.accept();
    } catch (java.io.IOException e) {
        showMessage("Socket Accept Error");
        return ;
    }
    onConnected(cSocket);
}