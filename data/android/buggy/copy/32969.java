android.database.Cursor getCursor(java.io.File databaseFile) {
    android.database.sqlite.SQLiteDatabase database = getReadableDatabase(databaseFile);
    openedDatabases.put(databaseFile.getPath(), database);
    return getCursor(database);
}