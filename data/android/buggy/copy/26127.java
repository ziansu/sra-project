@java.lang.Override
public void run() {
    disconnectFromRoomInternal();
    try {
        connectToWebsocketInternal();
    } catch (java.lang.Exception e) {
        reportError(("WebSocketerror: " + (e.toString())));
    }
}