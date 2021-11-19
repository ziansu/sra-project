public boolean isConnected() {
    return (((mCommandSocket) != null) && (!(mCommandSocket.isClosed()))) && (mCommandSocket.isConnected());
}