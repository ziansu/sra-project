@java.lang.SuppressWarnings(value = "deprecation")
public void stop() throws java.io.IOException {
    socket.close();
    server.stop();
    thread.stop();
}