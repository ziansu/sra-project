private void disconnectServer() {
    connThread.interrupt();
    conn = null;
    connThread = null;
    sendMessage(com.scottmckittrick.arduinoserverclientlib.TCPService.ServerService.MSG_SERVER_DISCONNECTED, null);
}