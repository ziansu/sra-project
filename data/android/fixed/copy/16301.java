public void sendMessage(java.lang.String message) {
    writer.println(message);
    writer.flush();
}