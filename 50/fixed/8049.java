public void sendMessage(java.lang.String message) {
    if ((_ws) != null) {
        _ws.send(message);
    }
}