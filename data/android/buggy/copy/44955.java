@java.lang.Override
public void onStateChanged(io.casey.musikcube.remote.websocket.WebSocketService.State newState, io.casey.musikcube.remote.websocket.WebSocketService.State oldState) {
    if ((newState == (WebSocketService.State.Connected)) || (offlineQueue)) {
        tracks.requery();
    }
}