public void sendPackages(int frequency) {
    connectedThread = new com.example.make201512.bluetoothtester.BluetoothClassic.ConnectedThread(socket);
    connectedThread.start();
    connectedThread.write(frequency);
    android.util.Log.e(com.example.make201512.bluetoothtester.BluetoothClassic.TAG, "sendPackages被执行");
}