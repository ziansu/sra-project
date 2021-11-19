public void stop() {
    isWaitingData = false;
    shouldAutomaticallyReconnect = false;
    closeSocket();
    closeInputStream();
    closeOutputStream();
    inputStream = null;
    outputStream = null;
    socket = null;
}