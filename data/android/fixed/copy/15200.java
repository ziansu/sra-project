public java.lang.Boolean isConnected() {
    if ((mSocket) == null)
        return false;
    
    return mSocket.connected();
}