public void resume() {
    if ((networkStateReceiver.isConnected()) && (!(socketService.connected()))) {
        socketService.reconnect();
    }
    isPaused = false;
}