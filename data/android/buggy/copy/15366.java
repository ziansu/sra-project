public void close() throws java.io.IOException {
    if ((socket) != null)
        socket.close();
    
    if ((streamIn) != null)
        streamIn.close();
    
}