@java.lang.Override
public void deleteRoom(com.rooms.crm.Rooms room) {
    entityManager.remove(getRoomsById(room));
}