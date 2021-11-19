public void requestInputFromPlayer(java.util.UUID uuid, java.lang.String requestType) {
    networkServer.sendToPlayer(networkServer.getPlayerFromUUID(uuid), new uno.network.api.Packet(uno.network.api.MessageType.MESSAGE, ("request-" + requestType)));
}