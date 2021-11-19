@com.facebook.react.bridge.ReactMethod
public void clearEvents() {
    for (com.homypiandroid.SocketListener listener : com.homypiandroid.SocketConnection.jsEvents) {
        listener.unlink(socketService);
    }
}