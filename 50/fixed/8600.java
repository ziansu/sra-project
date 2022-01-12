public void write(java.lang.String s) {
    if ((finalBluetoothSocket) != null) {
        socketManager.write(s.getBytes());
    }
}