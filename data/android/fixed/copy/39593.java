private void initializeServerSocket() {
    try {
        serverSocket = new java.net.ServerSocket(0);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}