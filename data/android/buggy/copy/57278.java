public android.database.Cursor RawCustomQueryForAdapter(java.lang.String query) {
    android.util.Log.e(getClass().getName(), query);
    net.sqlcipher.database.SQLiteDatabase database = masterRepository.getReadableDatabase();
    android.database.Cursor cursor = database.rawQuery(query, null);
    return cursor;
}