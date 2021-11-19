private Business.Lobby getLobbyFromId(int id) {
    java.lang.String lobbyId = java.lang.String.valueOf(id);
    for (Business.Lobby lobby : lobbies) {
        if ((lobby.getLobbyID()) == lobbyId) {
            return lobby;
        }
    }
}