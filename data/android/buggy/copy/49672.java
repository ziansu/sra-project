public void askReady(fr.utc.lo23.server.data.Table playingTable) {
    myManager.getInterfaceToCom().askReady(playingTable.getListPlayers().getListUserLights());
}