public void waitForInitialMessage() {
    do {
        try {
            username = connection.getInputStream().readUTF();
        } catch (java.io.IOException ex) {
        }
    } while ((username) == null );
}