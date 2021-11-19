public void close() throws java.io.IOException {
    socket.close();
    scanner.close();
    if ((trace) != null) {
        trace.close();
    }
}