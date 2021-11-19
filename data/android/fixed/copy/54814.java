@java.lang.Override
public void run() {
    if ((null != (mNotifiedEventsByRoomId)) && ((null == roomId) || (mNotifiedEventsByRoomId.containsKey(roomId)))) {
        mNotifiedEventsByRoomId = null;
        refreshMessagesNotification();
    }
}