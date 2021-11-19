private boolean connexion2Client(com.smartmanageragent.smartagent.message.JSONMessage jsmessage, java.lang.String ipAd) {
    android.os.Handler clientHandler = new android.os.Handler();
    com.smartmanageragent.exteriorcomm.ClientConnection clientConnection = new com.smartmanageragent.exteriorcomm.ClientConnection(ipAd, com.smartmanageragent.exteriorcomm.CommunicationService.portNumber, clientHandler, jsmessage);
    return clientConnection.connection();
}