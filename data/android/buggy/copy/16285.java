public void startServer(int port) {
    mPort = port;
    mWorkThreadPool.execute(this);
    initServerSocket();
}