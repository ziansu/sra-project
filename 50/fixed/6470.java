public void tellClientRole() {
    try {
        outputStream.writeBoolean(connectedToSender);
    } catch (java.io.IOException io) {
    }
}