@java.lang.Override
protected void sendMessage(java.lang.String message) {
    writer.println(otherSideId);
    writer.println(message);
    writer.flush();
}