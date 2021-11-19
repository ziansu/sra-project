public void close() throws java.io.IOException {
    if (is_connected) {
        output_socket.close();
        is_connected = false;
    }
}