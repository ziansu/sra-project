@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(("DROP TABLE IF EXISTS " + (com.karambit.bookie.helper.DBHandler.USER_TABLE_NAME)));
    onCreate(db);
    if (db.isOpen()) {
        db.close();
    }
}