public java.lang.Integer getServerPlayers(java.lang.String server) {
    if ((serverPlayers.get(server)) == null) {
        return 0;
    }
    return serverPlayers.get(server);
}