public void stop() throws java.io.IOException {
    this.isRunning = false;
    serverSocket.close();
    threadPool.shutdown();
}