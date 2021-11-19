public int getGivenRoomId() {
    givenRoomId = req_room.getId();
    if (!(isMet)) {
        givenRoomId = given_room.getId();
    }
    return givenRoomId;
}