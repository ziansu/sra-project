static void stop() throws java.io.IOException {
    TextServerThread.in.close();
    TextServerThread.out.close();
    TextServerThread.socket.close();
}