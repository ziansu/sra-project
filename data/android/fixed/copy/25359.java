public void leaveRoom() {
    if ((currentRoom) != null) {
        Games.RealTimeMultiplayer.leave(connectionManager.client, this, currentRoom.getRoomId());
    }
    this.showSignedInFragment();
}