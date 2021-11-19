public void addRoomOwnership(java.lang.String roomID) {
    if (ownedRooms.add(roomID)) {
        chat.server.ChatRoom room = chat.server.ConnectionsSupervisor.getChatRoomByID(roomID);
        room.setOwnedByAccount(true);
    }
}