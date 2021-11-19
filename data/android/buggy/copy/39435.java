public void setData(Models.Room room) {
    this.id = room.getId();
    this.roomName = room.getName();
    this.roomsController = room.getRoomsController();
}