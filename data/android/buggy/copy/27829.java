@java.lang.Override
public boolean e_medium_room(java.lang.String r) {
    return (rooms.containsKey(r)) && ((rooms.get(r).getSize()) == (cpsc433.Room.RoomSize.MEDIUM));
}