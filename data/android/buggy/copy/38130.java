public void pause() {
    if ((networkStateReceiver.isConnected()) && (!(socketService.connected()))) {
        socketService.reconnect();
    }
    isPaused = true;
}