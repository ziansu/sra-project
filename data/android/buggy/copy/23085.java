public net.boreeas.riotapi.com.riotgames.platform.gameinvite.contract.LobbyStatus createArrangedBotTeamLobby(double queueId, java.lang.String difficulty) {
    return client.sendRpcAndWait(net.boreeas.riotapi.rtmp.services.LcdsGameInvitationService.SERVICE, "createArrangedTeamLobby", difficulty);
}