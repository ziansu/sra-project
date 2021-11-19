protected java.lang.Runnable newRunnable(java.net.Socket clientSocket) {
    return new Tp2.Ex06.Server.TimeWorker(clientSocket, this.sharedDate);
}