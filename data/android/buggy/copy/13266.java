public void joinLobby(java.lang.String name) {
    lobbyName = name;
    inLobby.set(true);
    java.lang.System.out.println((("You joined lobby \"" + name) + "\""));
    send(("LOBBY_LIST" + (bomberman.Main.DELIMITER)));
}