public android.database.Cursor getAllPeople() {
    android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
    android.database.Cursor cursor = db.query(true, Person.TABLE_NAME, null, null, null, null, null, ((Person.COL_NAME) + " ASC"), null);
    return cursor;
}