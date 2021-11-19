@java.lang.Override
public com.crosstheborder.lobby.shared.IRoom createRoom(java.lang.String name, int maxPlrs, crosstheborder.lib.User creator) throws java.rmi.RemoteException {
    com.crosstheborder.lobby.shared.IRoom room = new com.crosstheborder.lobby.server.Room(creator, name, maxPlrs);
    rooms.add(room);
    return room;
}