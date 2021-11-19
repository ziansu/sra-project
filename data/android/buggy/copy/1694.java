public GameObjects.Room createRoom(java.lang.String roomName, GameObjects.Player host) {
    GameObjects.Room room = roomManager.createRoom(roomName);
    room.setHost(host);
    room.addPlayer(host);
    return room;
}