@java.lang.Override
public void cmdBroadcastMessage(int senderId, java.lang.String msg) {
    sendToClient(java.lang.String.join(server.COMMAND_DELIMITER, server.SERVER_CHAT_MSG, java.lang.String.valueOf(senderId), msg));
}