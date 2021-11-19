@java.lang.Override
public void cmdWelcome(int assignedUserID, long allowedThinkTime, int capabilities) {
    sendToClient(java.lang.String.join(server.COMMAND_DELIMITER, server.SERVER_WELCOME, java.lang.String.valueOf(assignedUserID), java.lang.String.valueOf(allowedThinkTime), java.lang.String.valueOf(capabilities)), false);
}