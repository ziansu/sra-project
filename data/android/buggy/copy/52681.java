public void exit() {
    if ((aptoideMessageClientSocket) != null) {
        aptoideMessageClientSocket.disable();
    }
    if ((aptoideMessageServerSocket) != null) {
        aptoideMessageServerSocket.shutdown();
    }
}