public void endRound(java.util.ArrayList<com.tieto.crterminal.model.player.GamePlayer> winers, java.util.ArrayList<com.tieto.crterminal.model.player.GamePlayer> loser) {
    com.tieto.crterminal.model.command.JsonCRTCommand command = com.tieto.crterminal.model.command.JsonCommandBuilder.buildEndRoundCommand(com.tieto.crterminal.model.player.GamePlayerHost.mCurrentRound, winers, loser);
    mConnection.broadcastMessage(command.toString());
}