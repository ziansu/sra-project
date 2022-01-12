public void onMuxOpen(int channelId, org.eclipse.jetty.websocket.mux.MuxConnection connection) {
    if ((_onControl) != null) {
        _onControl.onOpen(connection);
    }
}