public void receive(java.lang.Object data) {
    _handler.obtainMessage(hs_mannheim.gestureframework.connection.wifidirect.WifiDirectChannel.MSG_DATA_RECEIVED, data).sendToTarget();
}