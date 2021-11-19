public void disconnect() {
    try {
        in.close();
        out.close();
        socket.close();
    } catch (java.io.IOException ex) {
        ex.printStackTrace();
    }
}