public void disconnect() {
    try {
        socket.close();
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Unable to disconnect client:");
        e.printStackTrace();
    }
}