public void openDB() {
    if (((mSQLiteDatabase) == null) || ((mSQLiteDatabase.isOpen()) == false))
        mSQLiteDatabase = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(dbPath, null);
    
}