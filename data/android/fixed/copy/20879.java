private java.net.ServerSocket createSslServerSocket(java.net.SocketAddress socketAddress) throws java.io.IOException, java.security.GeneralSecurityException {
    java.net.ServerSocket serverSocket = createSSLServerSocket();
    serverSocket.bind(socketAddress);
    serverSocket.setSoTimeout(0);
    return serverSocket;
}