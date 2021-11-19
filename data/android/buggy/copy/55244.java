public void createNewGameRoom(java.util.UUID pRequestingAccountID, java.lang.String pGameName, int pNumRequestedClients) {
    mw.server.network.lobby.GameRoom lNewGameRoom = new mw.server.network.lobby.GameRoom(pNumRequestedClients);
    lNewGameRoom.addClient(pRequestingAccountID);
    aGameRooms.put(pGameName, new mw.server.network.lobby.GameRoom(pNumRequestedClients));
}