@com.google.api.server.spi.config.ApiMethod(name = "saveMission")
public com.playposse.peertopeeroxygen.backend.beans.MissionBean saveMission(@com.google.api.server.spi.config.Named(value = "sessionId")
java.lang.Long sessionId, @com.google.api.server.spi.config.Named(value = "missionLadderId")
java.lang.Long missionLadderId, @com.google.api.server.spi.config.Named(value = "missionTreeId")
java.lang.Long missionTreeId, com.playposse.peertopeeroxygen.backend.beans.MissionBean missionBean) throws com.google.api.server.spi.response.UnauthorizedException {
    protectByAdminCheck(sessionId);
    return com.playposse.peertopeeroxygen.backend.serveractions.SaveMissionAction.saveMission(missionLadderId, missionTreeId, missionBean);
}