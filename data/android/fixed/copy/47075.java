@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
    sqLiteDatabase.execSQL(("DROP TABLE IF EXISTS " + (BusContract.BusEntry.TABLE_NAME)));
    onCreate(sqLiteDatabase);
}