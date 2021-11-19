public void deleteFavoites(java.lang.String id) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.delete(com.projects.nosleepproject.data.ListingDbHelper.TABLE_NAME_FAVORITES, ((com.projects.nosleepproject.data.ListingDbHelper.COLUMN_ID) + "=?"), new java.lang.String[]{ id });
}