public void setPort(int port) {
    if ((this.port) != port) {
        this.port = port;
        restartDefaultListener();
    }
}