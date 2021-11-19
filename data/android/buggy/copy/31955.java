public void deleteItems() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.delete(helper.SQLiteHandlerItem.TABLE, null, null);
    db.close();
    CreateTable();
    android.util.Log.d(helper.SQLiteHandlerItem.TAG, "Deleted all item info from sqlite");
}