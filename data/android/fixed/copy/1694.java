public GameObjects.Room createRoom(java.lang.String roomName, GameObjects.Player host) {
    GameObjects.Room room = roomManager.createRoom(roomName);
    room.addPlayer(host);
    room.setHost(host);
    return room;
}