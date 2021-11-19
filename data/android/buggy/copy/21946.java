public void deleteDataFromDB() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.delete(database.DatabaseHandler.TABLE_CHILD, null, null);
    db.delete(database.DatabaseHandler.TABLE_SESSIONS, null, null);
    db.close();
}