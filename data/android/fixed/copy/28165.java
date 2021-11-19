public void open() {
    try {
        inputStream = new java.io.DataInputStream(socket.getInputStream());
    } catch (java.io.IOException ioe) {
        java.lang.System.out.println(("Error getting input stream: " + ioe));
    }
}