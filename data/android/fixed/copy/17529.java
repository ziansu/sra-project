public void emptyEntries() {
    java.lang.String deleteQuery = "DELETE FROM " + (Data.RSDBhandler.TABLE_NAME);
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    db.execSQL(deleteQuery);
}