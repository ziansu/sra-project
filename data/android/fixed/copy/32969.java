android.database.Cursor getCursor(java.io.File databaseFile) {
    return getCursor(getReadableDatabase(databaseFile));
}