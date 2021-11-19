public static model.network.ServerSocketWorker setupSocketConnectionListener(int port, int listeningMode, model.listener.SocketConnectionListener listener) {
    model.network.ServerSocketWorker serverSocketWorker = new model.network.ServerSocketWorker(port, listeningMode, listener);
    serverSocketWorker.start();
    return serverSocketWorker;
}