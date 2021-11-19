public void playerJoinGame(java.lang.String playerName, java.lang.String playerID) {
    if (!(this.playerList.containsKey(playerID))) {
        this.playerList.put(playerName, playerID);
    }else {
        return ;
    }
}