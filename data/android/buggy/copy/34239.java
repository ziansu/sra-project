public void grantInvitePrivileges(double summonerId) {
    client.sendRpc(net.boreeas.riotapi.rtmp.services.LcdsGameInvitationService.SERVICE, "grantInvitePrivileges", summonerId);
}