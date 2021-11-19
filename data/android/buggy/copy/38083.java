public void closeDB() {
    if (mSQLiteDatabase.isOpen()) {
        mSQLiteDatabase.close();
    }
}