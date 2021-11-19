@com.facebook.react.bridge.ReactMethod
public void off(java.lang.String id) {
    com.homypiandroid.SocketListener listener = com.homypiandroid.SocketListener.findInList(com.homypiandroid.SocketConnection.jsEvents, id);
    if (listener != null)
        listener.unlink(socketService);
    
}