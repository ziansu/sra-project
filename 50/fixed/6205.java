@java.lang.Override
protected void onStop() {
    super.onStop();
    com.m2dl.shifoomi.repository.room.RoomRepository repository = com.m2dl.shifoomi.repository.room.RoomRepositoryFirebase.getInstance();
    repository.deleteRoom(roomId);
}