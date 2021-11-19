public void addPlayer(javax.websocket.Session session) {
    connectedPlayers.put(session, new Player());
    java.lang.System.out.println(("PLAYER CREATED :: " + (connectedPlayers.size())));
}