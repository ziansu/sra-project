public void sendMessageGetPlayers() {
    connectionHandler.sendMessage(MessageType.GameSendPlayersMessage, "?");
}