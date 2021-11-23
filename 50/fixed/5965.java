private void setWebSocket(com.koushikdutta.async.http.WebSocket webSocket) {
    this.webSocket = webSocket;
    this.webSocket.setStringCallback(getStringCallback());
    subscribeStates();
    getStates();
}