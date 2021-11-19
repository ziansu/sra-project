public void manageConnectedSocket(sensors.ibluez.FallbackBluetoothSocket mmSocket) {
    mConnectedThread = new sensors.ibluez.ConnectedThread(mmSocket, mHandler);
    sendMessageToMainActivity("Starting ConnectedThread...");
    mConnectedThread.start();
}