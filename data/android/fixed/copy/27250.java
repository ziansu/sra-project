@java.lang.Override
public void sendMessage(java.lang.String message) {
    writer.println(otherSideId);
    writer.println(message);
    writer.flush();
}