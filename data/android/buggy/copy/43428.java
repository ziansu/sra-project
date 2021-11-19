public void leaveAllRooms() {
    for (java.lang.String roomId : mRoomList) {
        leaveRoom(roomId);
    }
    mRoomList.clear();
}