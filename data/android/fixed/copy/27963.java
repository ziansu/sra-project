public void stop() throws java.io.IOException {
    socket.close();
    server.stop();
}