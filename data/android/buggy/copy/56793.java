@java.lang.Override
public int getPort() {
    if ((this.serverSocket) != null) {
        return this.serverSocket.getLocalPort();
    }
    return -1;
}