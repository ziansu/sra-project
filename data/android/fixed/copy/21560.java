public void run() {
    if ((com.llp.lunchkaki.services.WebSocketService.mWebSocketClient) == null) {
        com.llp.lunchkaki.services.WebSocketService.connectUserWebSocket();
    }
}