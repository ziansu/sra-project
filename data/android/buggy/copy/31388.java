public void end() {
    this.myServer.stopServer();
    serverRunning = false;
    setChanged();
    notifyObservers("The server is closed");
}