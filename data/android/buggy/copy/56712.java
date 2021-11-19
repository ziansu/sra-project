public android.database.Cursor getTableCursorFromDB(java.lang.String tableName) {
    java.lang.String selectQuery = "SELECT * FROM " + tableName;
    com.mycompany.kittylogs.SQLiteDatabase db = this.getReadableDatabase();
    return db.rawQuery(selectQuery, null);
}