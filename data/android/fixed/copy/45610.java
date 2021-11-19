private void sendMessage(java.lang.String message) throws java.lang.Exception {
    toClient.writeBytes((message + "\n"));
}