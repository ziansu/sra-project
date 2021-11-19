@com.facebook.react.bridge.ReactMethod
public void clearEvents() {
    if ((socketService) == null)
        return ;
    
    for (com.homypiandroid.SocketListener listener : com.homypiandroid.SocketConnection.jsEvents) {
        listener.unlink(socketService);
    }
}