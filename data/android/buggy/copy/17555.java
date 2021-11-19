public synchronized void updateRoomStateTimeStamp() {
    roomStateMap.get(room).timestamp = new java.util.Date();
}