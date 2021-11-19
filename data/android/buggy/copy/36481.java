private void talkToServer() {
    webSocket.request(1);
    webSocket.sendText("Hello");
}