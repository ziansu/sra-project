@java.lang.Override
public void onClose(org.java_websocket.WebSocket conn, int code, java.lang.String reason, boolean remote) {
    java.lang.System.out.println((conn + " has left the room!"));
}