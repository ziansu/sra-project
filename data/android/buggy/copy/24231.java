@java.lang.Override
public void run() {
    if ((state) != (org.appspot.apprtc.WebSocketChannelClient.WebSocketConnectionState.CLOSED)) {
        state = org.appspot.apprtc.WebSocketChannelClient.WebSocketConnectionState.CLOSED;
        events.onWebSocketClose();
    }
}