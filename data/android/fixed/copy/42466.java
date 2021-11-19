private void connectionScuessed() {
    mConnectedState = com.way.service.XXService.CONNECTED;
    mReconnectTimeout = com.way.service.XXService.RECONNECT_AFTER;
    if ((mConnectionStatusCallback) != null)
        mConnectionStatusCallback.connectionStatusChanged(mConnectedState, "");
    
}