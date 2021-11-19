public boolean isConnected() {
    return (!(mCommandSocket.isClosed())) && (mCommandSocket.isConnected());
}