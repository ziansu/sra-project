public java.util.ArrayList<com.database.madhusoodhan.database.EventEntity> getEventList() {
    com.database.madhusoodhan.database.DatabaseHandler db = new com.database.madhusoodhan.database.DatabaseHandler(this);
    return db.getAllEvents();
}