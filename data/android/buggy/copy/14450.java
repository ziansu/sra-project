@java.lang.Override
public void cmdReportIllegal(java.lang.String theIllegalCommandWithParameters) {
    sendToClient(java.lang.String.join(server.COMMAND_DELIMITER, server.SERVER_ILLEGAL, theIllegalCommandWithParameters));
}